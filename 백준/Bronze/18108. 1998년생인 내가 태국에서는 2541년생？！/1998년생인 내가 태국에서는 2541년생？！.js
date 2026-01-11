const fs = require('fs');

const year = Number(fs.readFileSync(0, 'utf8'));

console.log(year - 543);