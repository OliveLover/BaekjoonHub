const fs = require('fs');

const username = fs.readFileSync(0, 'utf8').trim();

console.log(username + "??!");