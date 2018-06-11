'use strict';
const config = require('../config');
const fs = require('fs');
const logger = require('../logger');

const sqlite = require('sqlite3');

if(config.db.verbose) {
  sqlite.verbose();
}

// check whether new schema must be created
const createSchema = !fs.existsSync(config.db.filename);

// initialize database (creates new file if not exists)
const db = new sqlite.Database(config.db.filename);

// create database schema if required
if (createSchema) {
  
  var path = config.db.schema_file;
  
  if(!fs.existsSync(path)) {

    logger.error(`The databse schema .sql file '${path}' was not found!`);
    process.exit('if file not found, exit execution');

  } else {

    var script = fs.readFileSync(path, { encoding: 'utf8'});

    var tablesScripts = script.split('-- Split');

    db.serialize(() => {
      for(var i = 0; i < tablesScripts.length; i++) {
        logger.log(`Running table script: \n ${tablesScripts[i]}`, 10000);
        db.run(tablesScripts[i], (err) => {
          if(err) {
            logger.error(err);
            process.exit(1);
          }
        });
      }
    });
  }
} 


module.exports = {
  db
};
