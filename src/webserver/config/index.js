require('dotenv').load();

const security = require('./security');
const server = require('./server');

// definiert das config-object
module.exports = {
  security,
  server
}
