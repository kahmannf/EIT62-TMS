const express = require('express');
const router = express.Router();

const logger = require('../../logger');
const auth = require('../../lib/auth');

router.post('/login', (req, res) => {
  res.sendStatus(501);
});

// middleware for registering a user
router.post('/register', (req, res) => {
  if(req.body.data && req.body.data.Username && req.body.data.Password) {

    auth.registerUser(req.body.data.Username, req.body.data.Password)
    .then(result => {
      if(result) {
        res.sendStatus(200);
      } else {
        res.sendStatus(400);
      }
    })
    .catch(err => {
      logger.error(err, 500);
      res.sendStatus(500);
    })
  
  } else {
    res.sendStatus(400);
  }
});

router.post('/refresh', (req, res) => {
  res.sendStatus(501);
});


module.exports = router;


