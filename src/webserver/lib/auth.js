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
 * Gets a user-object from the database
 * @param {string} username 
 * @returns a user-object without hash and salt properties
 */
const getUserByUsername = (username) => new Promise((resolve, reject) => {

  username = username.trim();

  var sql = 'select id, username from user where lower(username) like lower(?)';

  db.get(sql, username, (err, row) => {
    if(err) {
      reject(err);
    } else if (row) {
      resolve(row);
    } else {
      reject(`no user with username '${username}'`);
    }
  });

});

/**
 * Creates a jsonwebtoken for authentication containing the user as payload
 * @param {string} username 
 * @returns {string} a jsonwebtoken
 */
const getToken = (username) => new Promise((resolve, reject) => {
  getUserByUsername(username)
  .then(user => {
    resolve(security.getToken(user)); 
  })
  .catch(reject);
});

module.exports = {
  getToken,
  registerUser,
  verifyCredentials
}
