const express = require('express');
const bodyparser = require('body-parser');

const config = require('./config');
const routes = require('./routes');
const logger = require('./logger');

// Erstellt eine express app
const app = express();

// parsed den json-body des request in ein javascript-object,
// welches in der 'body'-Eigenschaft des requests gespeicher wird
app.use(bodyparser.json());

app.use((req, res, next) => {
  logger.log(`Incomming ${req.method} on ${req.url}`, 10000);
  next();
})

// Leitet alle eingehenden request an das Router-Object aus routes/index.js weiter
app.use(routes);

// startet den server und loggt eine message wenn der server laeuft
const server = app.listen(config.server.port, () => {
  logger.log('Server listening on ' + config.server.port, 0);
});

// server fuer mocha unit test exportieren
module.exports = server;
