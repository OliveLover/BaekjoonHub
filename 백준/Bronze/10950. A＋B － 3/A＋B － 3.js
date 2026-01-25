const fs = require('fs');

const readLine = fs.readFileSync('/dev/stdin').toString().trim().split("\n");

const t = Number(readLine[0]);
let result = "";

for (var i = 1; i <= t; i++) {
    const [first, second] = readLine[i].split(' ').map(Number);

    result += (first + second) + "\n";
}

process.stdout.write(result);