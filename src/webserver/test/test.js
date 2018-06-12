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
    
    it('/auth/register', function () {
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

    it('/auth/login', function() {
      return chai.request(app)
        .post('auth/login')
        .send({
          authdata: {
            Username: 'Tester',
            Password: 'test123'
          }
        }).then((res, err) => {
          expect(err).to.be.undefined;
          expect(res).to.have.status(200);
          expect(res)
        });
    });

  });

  this.afterAll(function endApp() {
    app.close();
  });

});
