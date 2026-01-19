const fs = require('fs');

const readLine = fs.readFileSync(0, 'utf8').trim();

let [h, m] = readLine.split(' ').map(Number);
const early = 45;

m -= early;

if (m < 0) {
    h -= 1;
    m += 60;

    if (h < 0) {
        h += 24;
    }
}

console.log(h + " " + m);