const fs = require('fs');

const n = Number(fs.readFileSync('/dev/stdin').toString().trim());
let result = n * (1 + n) / 2;

console.log(result);