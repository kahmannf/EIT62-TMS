'use strict';
const security = require('./security');
const db = require('./db');
const user = require('./user');

/**
 * 
 * @param {string} username usernameof the new user
 * @param {string} password password of the new user
 * @returns {Promise} a promise that respresents a boolean. If false,username already exists
 */
const registerUser = (username, password) => new Promise((resolve, reject) => {
  user.checkIfUsernameExists(username)
  .then(result => {
    
    // username already exists
    if(result) {
      resolve(false);
    } else {
      var sql = 'insert into user(username, hash, salt) values($username, $hash, $salt)';

      var salt = security.genRandomString(50);
      var hash = security.getHash(password, salt);

      var params = {
        $username: username,
        $hash: hash,
        $salt: salt
      }

      db.run(sql, params, (err) => {
        if(err) {
          reject(err);
        } else {
          resolve(true);
        }
      });
    }

  })
  .catch(reject);
});

/**
 * checks whether the giver credentials are valid login creadentials
 * @param {string} username 
 * @param {string} password
 * @returns {Promise} represents a boolean value which indicates whether the crediential are valid 
 */
const verifyCredentials = (username, password) => new Promise((resolve, reject) => {
  var sql = 'select * from user where lower(username) like lower(?)';

  username = username.trim();

  db.get(sql, username, (err, row) => {
    if(err) {
      reject(err);
    } else if (row) {

      if(security.verifyPassword(password, row.Hash, row.Salt)){
        resolve(true);
      } else {
        resolve(false);
      }
    } else {
      resolve(false);
    }
  });
});



/**
 * Creates a jsonwebtoken for authentication containing the user as payload
 * @param {string} username 
 * @returns {Promise} a jsonwebtoken
 */
const getAccessToken = (username) => new Promise((resolve, reject) => {
  user.getUserByUsername(username)
  .then(dbuser => {
    resolve(security.getToken(dbuser)); 
  })
  .catch(reject);
});

/**
 * Creates a jsonwebtoken as a refresh containing the userid as payload
 * @param {string} username 
 * @returns {Promise} a jsonwebtoken
 */
const getRefreshToken = (username) => new Promise((resolve, reject) => {
  user.getUserByUsername(username)
  .then(dbuser => {
    resolve(security.getRefreshToken(dbuser.ID)); 
  })
  .catch(reject);
}); 

module.exports = {
  getAccessToken,
  getRefreshToken,
  registerUser,
  verifyCredentials
}
