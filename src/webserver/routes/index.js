const express = require('express');
const router = express.Router();

const auth = require('./auth');

const secure = require('./secure');

router.use('/auth', auth);
router.use('/secure', secure);


module.exports = router;


