const express = require('express');
const router = express.Router();

router.post('/login', (req, res) => {
  res.sendStatus(501);
});

router.post('/register', (req, res) => {
  res.sendStatus(501);
});

router.post('/refresh', (req, res) => {
  res.sendStatus(501);
});


module.exports = router;


