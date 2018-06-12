'use strict';
require('dotenv').load();

const security = require('./security');
const server = require('./server');
const db = require('./db');

// definiert das config-object
module.exports = {
  db,
  security,
  server
}
