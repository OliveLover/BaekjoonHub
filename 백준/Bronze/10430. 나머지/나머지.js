const fs = require('fs');

const line = fs.readFileSync(0, 'utf8').trim();
const [a, b, c] = line.split(' ').map(Number);

let answer = "";
answer += `${(a + b) % c}\n`;
answer += `${((a % c) + (b % c)) % c}\n`;
answer += `${(a * b) % c}\n`;
answer += `${((a % c) * (b % c)) % c}`;

console.log(answer);