'use strict';
const express = require('express');
const router = express.Router();

const logger = require('../../logger');

const project = require('../../lib/projects');

// speichert ein project. 
// Wenn projectid undefined/null/0 ist wird ein neues angelegt
router.post('/save', (req, res) => {
  if(req.body.Description) {
    project.saveProject(req.body, req.oauth.payload)
    .then(()=> {
      res.sendStatus(202);
    })
    .catch(err => {
      logger.error(err, 500);
      res.sendStatus(500);
    })
  } else {
    res.sendStatus(400);
  }
});

// laedt alle projekte eines nutzer
router.get('/mine', (req, res) => {
  project.getUserProjects(req.oauth.payload)
    .then(result => res.json(result))
    .catch(err => {
      logger.error(err, 500);
      res.sendStatus(500);
    });
});

// fuegt ein User zu einem Projekt hinzu
router.post('/:projectid/add-user/:userid', (req, res) => {
  res.sendStatus(501);
});

// laedt eine 'page' der projekt-tickets
router.get('/:projectid/tickets', (req, res) => {
  res.sendStatus(501);
});

// erstellt ein neues ticket zu dem projekt
router.post('/:projectid/new-ticket', (req, res) => {
  res.sendStatus(501);
});


module.exports = router;
