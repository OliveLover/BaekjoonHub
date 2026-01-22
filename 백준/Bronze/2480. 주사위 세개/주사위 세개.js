const fs = require('fs');

const readLine = fs.readFileSync('/dev/stdin').toString().trim();
const oppertunity = readLine.split(' ').map(Number);
const resultCount = Array(7).fill(0);
let maxCount = 0;
let maxNum = 0;
let manyNum = 0;

for (var i = 0; i < oppertunity.length; i++) {
    let num = oppertunity[i];
    resultCount[num]++;

    if (maxCount < resultCount[num]) {
        maxCount = resultCount[num];
    }

    if (maxNum < num) {
        maxNum = num;
    }

    if (maxCount === resultCount[num]) {
        manyNum = num;
    }
}

let awards = 0;
if (maxCount === 1) {
    awards = maxNum * 100;
} else if (maxCount === 2) {
    awards = 1000 + manyNum * 100;
} else {
    awards = 10000 + manyNum * 1000;
}

console.log(awards);