const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', function(line) {
  const input = line.split(' ');
  const a = Number(input[0]);
  const b = Number(input[1]);

  const result = a - b;

  console.log(result);

  rl.close();
});