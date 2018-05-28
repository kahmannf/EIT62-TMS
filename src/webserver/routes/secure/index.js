const express = require('express');
const router = express.Router();

const { decodeToken, requireAuth } = require('../../lib/auth');

// token decodieren und payload in req.oauth.payload ablegen,
// sowie req.oauth.verified auf true oder false setzten
router.use(decodeToken);

// nur verifiziert nutzer ab hier
router.use(requireAuth);


module.exports = router;


