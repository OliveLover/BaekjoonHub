const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', (line) => {
  input.push(line);

  if(input.length == 2) {
    const a = Number(input[0]);
    const b = input[1];

    console.log(a * Number(b[2]));
    console.log(a * Number(b[1]));
    console.log(a * Number(b[0]));
    console.log(a * b);

    rl.close();
  }
});