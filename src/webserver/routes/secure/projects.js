const express = require('express');
const router = express.Router();

// speichert ein project. 
// Wenn projectid undefined/null/0 ist wird ein neues angelegt
router.post('/save', (req, res) => {
  res.sendStatus(501);
});

// laedt alle projekte eines nutzer
router.get('/mine', (req, res) => {
  res.sendStatus(501);
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
