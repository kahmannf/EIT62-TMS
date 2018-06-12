'use strict';
const crypto = require('crypto');
const jwt = require('jsonwebtoken');

const config = require('../config');
const logger = require('../logger');

/**
 * generates a pseudo-random string
 * @param {number} length length of the generated string
 * @returns {string} a pseudo-random string  
 */
const genRandomString = function(length){
  return crypto.randomBytes(Math.ceil(length/2))
          .toString('hex') /** convert to hexadecimal format */
          .slice(0,length);   /** return required number of characters */
};

/**
 * Hashes a password with a salt and returns the hashed value
 * @param {string} password the password to hash
 * @param {string} salt the salt used for hashing
 * @returns {string} a hex hash value
 */
const getHash = function(password, salt){
  var hash = crypto.createHmac('sha512', salt); /** Hashing algorithm sha512 */
  hash.update(password);
  var value = hash.digest('hex');
  return value;
};

/**
 * 
 * @param {string} password the password
 * @param {string} hash the hashed password
 * @param {string} salt the salt used for hashing the password
 * @returns {boolean} whether the password is a valid value for creating the hash
 */
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

/**
 * Generates a new jsonwebtoken
 * @param {any} payload a value that will be included in the token
 * @returns {string} a jsonwebtoken
 */
const getToken = (payload) => {
  return jwt.sign(payload, config.security.tokensecret, { expiresIn: config.security.tokentll });
}

/**
 * Generates a new jsonwebtoken that never expires
 * @param {any} payload a value that will be included in the token
 * @returns {string} a jsonwebtoken
 */
const getRefreshToken = (payload) => {
  return jwt.sign(payload, config.security.tokensecret);
}

/**
 * gets the payload from a jsonwebtoken
 * @param {string} token a jsonwebtoken
 * @returns {Promise} a promise that resolves into the payload of the token
 */
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

/**
 * a middleware-function to decode a token in the Authentication-Header and save its data in the Request object (req.oauth)
 * @param {Request} req a express request object
 * @param {Response} res a express response object
 * @param {NextFunction} next a express next-function 
 */
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

/**
 * a middleware-function that will cancel all request with invalid/no jsonwebtoken with a HTTP 401 code 
 * @param {Request} req a express request object
 * @param {Response} res a express response object
 * @param {NextFunction} next a express next-function 
 */
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
  getRefreshToken,
  getToken,
  genRandomString,
  requireAuth,
  verifyPassword
}