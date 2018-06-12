'use strict';
const express = require('express');
const router = express.Router();

// router importieren
const projects = require('./projects');
const tickets = require('./tickets');
const users = require('./users');
const util = require('./util');

const { decodeToken, requireAuth } = require('../../lib/security');

// token decodieren und payload in req.oauth.payload ablegen,
// sowie req.oauth.verified auf true oder false setzten
router.use(decodeToken);

// nur verifiziert User ab hier.
// Antwortet mit einem 401 wenn kein gültiger Token vorhaden
router.use(requireAuth);

// router an die jeweiligen Routen anbinden
router.use('/projects', projects);
router.use('/tickets', tickets);
router.use('/users', users);
router.use(util);

module.exports = router;


