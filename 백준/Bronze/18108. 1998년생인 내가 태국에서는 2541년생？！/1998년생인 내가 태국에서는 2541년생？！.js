const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', function(line) {
  const input = line.split(' ');
  const y = input[0];
  const result = y - 543;

  console.log(result);

  rl.close();
});