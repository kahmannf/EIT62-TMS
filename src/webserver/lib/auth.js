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



module.exports = {
  registerUser
}
