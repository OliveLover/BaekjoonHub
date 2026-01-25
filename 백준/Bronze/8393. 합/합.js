const fs = require('fs');

const n = Number(fs.readFileSync('/dev/stdin').toString().trim());
let result = 0;

for (var i = 1; i <= n; i++) {
    result += i;
}

console.log(result);