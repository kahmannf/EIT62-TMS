'use strict';
const config = require('../config');
const fs = require('fs');
const logger = require('../logger');

const sqlite = require('sqlite3');

if(config.db.verbose) {
  sqlite.verbose();
}

// check whether new schema must be created
const createSchema = fs.existsSync(config.db.filename);

// initialize database (creates new file if not exists)
const db = new sqlite.Database(config.db.filename);

// create database schema if required
if (createSchema) {
  
  var path = config.db.schema_file;
  
  if(!fs.existsSync(path)) {

    logger.error(`The databse schema .sql file '${path}' was not found!`);
    process.exit('if file not found, exit execution');

  } else {
    
  }
} 


module.exports = {
  db: sqlite,
};
