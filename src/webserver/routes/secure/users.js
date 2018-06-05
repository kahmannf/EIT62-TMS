const express = require('express');
const router = express.Router();

// laedt die daten des eingeloggten benutzers
router.get('/me', (req, res) => {
  res.sendStatus(501);
});

// sucht nach Nutzern
router.get('/search', (req, res) => {
  res.sendStatus(501);
});

module.exports = router;
