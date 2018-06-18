'use strict';
const db = require('./db');

const saveProject = (project, user) => new Promise((resolve, reject) => {
  
  if(project.ID) {
    getProjectById(project.ID)
    .then(dbproject => {
      let sqlUpdate = 'update project set description = ? where id = ?';

      db.run(sql, [project.Description, project.ID], err => {
        if(err) {
          reject(err);
        } else {
          resolve();
        }
      });
    })
    .catch(err => reject(err));
  } else {
    let sqlInsert = 'insert into project(Description, Timestamp, OwnerID) values (?, ?, ?)';
    db.run(sqlInsert, [project.Description, new Date(), user.ID], err => {
      if(err) {
        reject(err);
      } else {
        resolve();
      }
    });
  }
  
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

const getProjectById = (projectid) => new Promise((resolve, reject) => {
  let sql = 'select * from project where id = ?';

  db.get(sql, projectid, (err, row) => {
    if(err) {
      reject(err);
    } else if (row) {
      resolve(row);
    } else {
      reject(new Error(`No project with id '${projectid}'`));
    }
  });
});

module.exports = {
  saveProject,
  getUserProjects
}