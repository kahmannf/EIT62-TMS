const express = require('express');

const config = require('./config');

const routes = require('./routes');

const logger = require('./logger');

const app = express();

app.use(routes);

app.listen(config.server.port, () => {
  logger.log('Server listening on ' + config.server.port);
});
