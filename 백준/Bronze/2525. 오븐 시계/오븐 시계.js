const fs = require('fs');

const [readLine1, readLine2] = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let [hours, minutes] = readLine1.split(' ').map(Number);
let timer = Number(readLine2);
let addHours = 0;
let addMinutes = 0;

addHours += (timer / 60) | 0;
addMinutes += (timer % 60);

hours += addHours;
minutes += addMinutes;

if (minutes >= 60) {
    hours += 1;
    minutes %= 60;
}

if (hours >= 24) {
    hours %= 24;
}

console.log(hours + " " + minutes);