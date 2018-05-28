'use strict';
const crypto = require('crypto');
const jwt = require('jsonwebtoken');

const config = require('../config');
const logger = require('../logger');

const genRandomString = function(length){
  return crypto.randomBytes(Math.ceil(length/2))
          .toString('hex') /** convert to hexadecimal format */
          .slice(0,length);   /** return required number of characters */
};

const getHash = function(password, salt){
  var hash = crypto.createHmac('sha512', salt); /** Hashing algorithm sha512 */
  hash.update(password);
  var value = hash.digest('hex');
  return value;
};

const verifyPassword = (password, hash, salt) => {
  const newHash = getHash(password, salt);
  
  if(newHash.length != hash.length) {
    return false;
  }

  var valid = true;

  for(var i = 0; i < hash.length; i++) {
    if(hash[i] != newHash[i]) {
      valid = false;
    }
  }

  return valid;
};

const getToken = (user) => {
  return jwt.sign(user, config.security.tokensecret, { expiresIn: config.security.tokenttl});
}

const getPayload = (token) => {
  return new Promise((resolve, reject) => {
    jwt.verify(token, config.security.tokensecret, (err, result) => {
      if(err) {
        reject(err);
      }
      else {
        resolve(result)
      }
    });
  });
}

const decodeToken = (req, res, next) => {
  var token = req.get('Authentication');
  if(token) {
    var tsplit = token.split(' ');
    if(tsplit && tsplit.length == 2 && tsplit[1]) {
      getPayload(tsplit[1])
      .then(payload => {
        req.oauth = {
          verified: true,
          payload: payload
        };
        next();
      })
      .catch(err => {
        req.oauth = { 
          verified: false,
          reason: err
        };
        next();
      });
    }
    else {
      req.oauth = { 
        verified: false
      };
      next();
    }
  }
  else {
    req.oauth = { 
      verified: false
    };
    next();
  }
};

const requireAuth = (req, res, next) => {
  if(req.oauth) {
    if(req.oauth.verified) {
      next();
    }
    else {
      if(req.oauth.reason) {
        res.status(401).json(req.oauth.reason);
      }
      else {
        res.sendStatus(401);
      }
    }
  }
  else {
    logger.error('!!!Request without oauth data');
    res.sendStatus(500);
  }
}

module.exports = {
  decodeToken,
  getHash,
  getPayload,
  getToken,
  genRandomString,
  requireAuth,
  verifyPassword
}