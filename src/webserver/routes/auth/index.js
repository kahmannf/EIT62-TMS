'use strict';
const express = require('express');
const router = express.Router();

const logger = require('../../logger');
const auth = require('../../lib/auth');

//middleware for login
router.post('/login', (req, res) => {
  if (req.body.authdata && req.body.authdata.Username && req.body.authdata.Password) {

    auth.verifyCredentials(req.body.authdata.Username, req.body.authdata.Password)
      .then(valid => {
        if (valid) {
          auth.getAccessToken(req.body.authdata.Username)
            .then(token => {

              auth.getRefreshToken(req.body.authdata.Username)
                .then(refresh_token => {
                  res.json({ token, refresh_token });
                })
                .catch(err => {
                  logger.error(err, 500);
                  res.sendStatus(500);
                });

            })
            .catch(err => {
              logger.error(err, 500);
              res.sendStatus(500);
            });
        } else {
          res.sendStatus(401);
        }
      })
      .catch(err => {
        logger.error(err, 500);
        res.sendStatus(500);
      });

  } else {
    res.sendStatus(400);
  }
});

// middleware for registering a user
router.post('/register', (req, res) => {
  console.dir(req.body);
  if (req.body.data && req.body.data.Username && req.body.data.Password) {

    auth.registerUser(req.body.data.Username, req.body.data.Password)
      .then(result => {
        if (result) {
          res.sendStatus(202);
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


