'use strict';
const config = require('./config');

const log = (message, loglevel = 0) => { 
  if(loglevel <= config.server.logLevel) {
    console.log(message);
  }
}
const error = (error, loglevel = 0) => {
  if(loglevel <= config.server.logLevel) {
    console.error(error);
  }
}
const dir = (obj, loglevel = 0) => {
  if(loglevel <= config.server.logLevel) {
    console.dir(obj);
  }
}

module.exports = {
  log,
  error,
  dir
}
