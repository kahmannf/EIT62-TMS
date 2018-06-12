const assert = require('assert');
const fs = require('fs');

const chai = require('chai');
const chaiHttp = require('chai-http');

const expect = chai.expect;

chai.use(chaiHttp);

var app;

describe('test', function () {
  this.beforeAll(function serverSetup(done) {

    // delete old test db
    if (fs.existsSync('testDBTemp.sqlite')) {
      fs.unlinkSync('testDBTemp.sqlite');
    }

    // override default db name
    const config = require('../config');
    config.db.filename = 'testDBTemp.sqlite';

    // set logging level to errors only
    config.server.logLevel = 500;

    // start server
    app = require('../index');

    done();

  });

  describe('auth', function () {
    
    it('/auth/registershould register new user', function () {
      return chai.request(app)
        .post('/auth/register')
        .send({
          data: {
            Username: 'Tester',
            Password: 'test123'
          }
        })
        .then((res, err) => {
          expect(err).to.be.undefined;
          expect(res).to.have.status(202);
        });
    });

    it('/auth/register should not accept existing username', function () {
      return chai.request(app)
        .post('/auth/register')
        .send({
          data: {
            Username: 'Tester',
            Password: 'test123'
          }
        })
        .then((res, err) => {
          expect(err).to.be.undefined;
          expect(res).to.have.status(400);
        });
    });

    it('/auth/login should login user an recieve tokens', function() {
      return chai.request(app)
        .post('/auth/login')
        .send({
          authdata: {
            Username: 'Tester',
            Password: 'test123'
          }
        }).then((res, err) => {
          expect(err).to.be.undefined;
          expect(res).to.have.status(200);
          expect(res.body).to.be.a('object').that.has.all.keys(['token', 'refresh_token']);

          expect(res.body.token).to.be.a('string');
          expect(res.body.refresh_token).to.be.a('string');
        });
    });

  });


  describe('secure', function() {

    this.beforeAll(function setUpUsers(done) {

      let count = 0;
      let total = 2;
      
      let complete = () =>{
        count++;
        if(count === total) {
          done();
        }
      }

      chai.request(app)
      .post('/auth/register')
      .send({
        data: {
          Username: 'Dummy1',
          Password: 'test123'
        }
      })
      .then(() => complete())
      .catch(errr => { throw err; });

      chai.request(app)
      .post('/auth/register')
      .send({
        data: {
          Username: 'Dummy2',
          Password: 'test123'
        }
      })
      .then(() => complete())
      .catch(errr => { throw err; });

    }); 

    var testerAuthData;
    var dummy1AuthData;
    var dummy2AuthData;
    var project;

    beforeEach(function loginUsers(done) {

      let count = 0;
      let total = 3;

      const complete = () => {
        count++;
        if(count === total) {
          done();
        }
      }

      chai.request(app)
      .post('/auth/login')
      .send({
        authdata: {
          Username: 'Tester',
          Password: 'test123'
        }
      })
      .then(res => {
        testerAuthData = res.body;
        complete();
      })
      .catch(err => { throw err; });

      chai.request(app)
      .post('/auth/login')
      .send({
        authdata: {
          Username: 'Dummy1',
          Password: 'test123'
        }
      })
      .then(res => {
        dummy1AuthData = res.body;
        complete();
      })
      .catch(err => { throw err; });

      chai.request(app)
      .post('/auth/login')
      .send({
        authdata: {
          Username: 'Dummy2',
          Password: 'test123'
        }
      })
      .then(res => {
        dummy2AuthData = res.body;
        complete();
      })
      .catch(err => { throw err; });

    });

    it('/secure/projects/save should create project on empty id', function (){
      
      return chai.request(app)
      .post('/secure/projects/save')
      .set('Authorization', testerAuthData.token)
      .send({
        Description: 'Testproject'
      }).then((res, err) => {
        expect(err).to.be.undefined;
        expect(res).to.have.status(202);
      });
    });

    it('/secure/projects/save should not accept invalid project', function (){
      return chai.request(app)
      .post('/secure/projects/save')
      .set('Authorization', testerAuthData.token)
      .send({
      }).then((res, err) => {
        expect(err).to.be.undefined;
        expect(res).to.have.status(400);
      });
    });

    it('/secure/projects/mine should return the created project for Tester', function() {
      return chai.request(app)
      .get('/secure/projects/mine')
      .set('Authorization', testerAuthData.token)
      .send()
      .then((res, err) => {
        expect(err).to.be.undefined;
        expect(res.body).to.be.a('array');
        expect(res.body.length).to.equal(1);
        expect(res.body[0]).to.be.a('object').that.has.all.keys(['Description', 'ID', 'Timestamp', 'Members']);
        expect(res.body[0].Description).to.equal('Testproject');

        project = res.body[0];
      });
    });

    it('/secure/projects/mine should return no project for Dummy1', function() {
      return chai.request(app)
      .get('/secure/projects/mine')
      .set('Authorization', dummy1AuthData.token)
      .send()
      .then((res, err) => {
        expect(err).to.be.undefined;
        expect(res.body).to.be.a('array');
        expect(res.body.length).to.equal(0);
      });
    });

    it('/secure/projects/{projectid}/add-user/{userid}', function() {
      expect(false).to.be.true;
    });

    it('/secure/projects/{projectid}/new-ticket', function() {
      expect(false).to.be.true;
    });

    it('/secure/projects/{projectid}/tickets', function() {
      expect(false).to.be.true;
    });

    
    it('/secure/tickets/{ticketid}', function() {
      expect(false).to.be.true;
    });

    it('/secure/tickets/update', function() {
      expect(false).to.be.true;
    });

    it('/secure/tickets/{ticketid}/add-comment', function() {
      expect(false).to.be.true;
    });

    it('/secure/users/me', function() {
      expect(false).to.be.true;
    });

    it('/secure/users/search', function() {
      expect(false).to.be.true;
    });

    it('/secure/status/all', function() {
      expect(false).to.be.true;
    });

  });




  this.afterAll(function endApp() {
    app.close();
  });

});
