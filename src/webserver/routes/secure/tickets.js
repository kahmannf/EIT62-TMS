'use strict';
const express = require('express');
const router = express.Router();

// updated ein bereit vorhandenes Ticket
router.post('/update', (req, res) => {
  res.sendStatus(501);
});

// laedt ein einzelnes Ticket
router.get('/:ticketid', (req, res) => {
  res.sendStatus(501);
});

// fuegt einen Kommentar zu einem Ticket hinzu
router.post('/:ticketid/add-comment', (req, res) => {
  res.sendStatus(501);
});


module.exports = router;
