const db = require('./db');


/**
 * check if a username already exists in the database
 * @param {string} username 
 * @returns {Promise} a promise that represents a boolean
 */
const checkIfUsernameExists = (username) => new Promise((resolve, reject) => {
  
  username = username.trim();
  
  db.get('select * from User where lower(UserName) like lower(?)', username, (err, row) => {

    if(err) {
      reject(err);
    } else if (row) {
      resolve(true);
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
      reject(new Error(`no user with username '${username}'`));
    }
  });

});

module.exports = {
  checkIfUsernameExists,
  getUserByUsername
}
