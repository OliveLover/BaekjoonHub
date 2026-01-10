const fs = require('fs');

const data = fs.readFileSync(0, 'utf8').trim();

const [a, b] = data.split(' ').map(Number);

console.log(a - b);