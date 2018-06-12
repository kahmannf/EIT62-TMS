const assert = require('assert');
const fs = require('fs');

const chai = require('chai');
const chaiHttp = require('chai-http');

const expect = chai.expect;

chai.use(chaiHttp);

var app;

describe('test', function () {
  this.beforeAll(function serverSetup(done) {

    if (fs.existsSync('testDBTemp.sqlite')) {
      fs.unlinkSync('testDBTemp.sqlite');
    }

    fs.copyFileSync('testDB.sqlite', 'testDBTemp.sqlite');

    const config = require('../config');
    config.db.filename = 'testDBTemp.sqlite';

    // start server
    app = require('../index');

    done();

  });

  it('config should have testDBTemp.sqlite as DBFilename', function () {
    const config = require('../config');
    assert.equal(config.db.filename, 'testDBTemp.sqlite');
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

});
