const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let x = input[0];
const n = input[1];

for (let i = 0; i < n; i++) {
    const [a, b] = input[2 + i].split(' ').map(Number);

    x -= a * b;
}

console.log(x == 0 ? "Yes" : "No");