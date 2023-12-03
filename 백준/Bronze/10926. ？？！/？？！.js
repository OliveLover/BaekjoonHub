const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', function(line) {
  const input = line.split(' ');

  console.log(input[0] + '??!');

  rl.close();
});