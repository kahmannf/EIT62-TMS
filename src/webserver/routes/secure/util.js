const express = require('express');
const router = express.Router();

router.get('/status/all', (req, res) => {
  res.sendStatus(501);
});

module.exports = router;
