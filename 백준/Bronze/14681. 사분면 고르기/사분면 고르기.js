const fs = require('fs');

const readLine = fs.readFileSync(0, 'utf8').trim();

const [x, y] = readLine.split('\n').map(Number);
let quadrant = 0;

if (x > 0 && y > 0) {
    quadrant = 1;
} else if (x < 0 && y > 0) {
    quadrant = 2;
} else if (x < 0 && y < 0) {
    quadrant = 3;
} else {
    quadrant = 4;
}

console.log(quadrant);