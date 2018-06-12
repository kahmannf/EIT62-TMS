'use strict';
const db = require('./db');

const saveProject = (project, user) => new Promise((resolve, reject) => {
  
  
  reject();
});

const getUserProjects = (user) => new Promise((resolve, reject) => {
  let sql = 'select p.ID, p.Timestamp, p.Description, p.OwnerID from project p, projectmember pm where p.ID = pm.IDProject and (p.ownerid = ? or pm.iduser = ?)';

  db.all(sql, user.ID, (err, rows) => {
    if(err) {
      reject(err);
    } else if (rows) {
      resolve(rows);
    } else {
      resolve([]);
    }
  });
});


module.exports = {
  saveProject,
  getUserProjects
}