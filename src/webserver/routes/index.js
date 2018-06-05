const express = require('express');
const router = express.Router();

const auth = require('./auth');

const secure = require('./secure');

// definiertdie routes fuer eingehende requests
router.use('/auth', auth);
router.use('/secure', secure);


module.exports = router;


