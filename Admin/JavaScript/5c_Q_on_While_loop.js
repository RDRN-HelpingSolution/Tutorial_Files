// .........................While loop....................................

console.log();
console.log("________________________________________________________");
console.log();
console.log("while loop..............................................");
console.log();

// .......................................................................
console.log("Q : Sum of Even Numbers");
console.log();
var a = 0,
  b = 10,
  sum = 0,
  r = a;
while (r % 2 == 0 && r <= b) {
  sum = sum + r;
  r = r + 2;
}
console.log("Sum of Even Numbers between " + a + " to " + b + " is " + sum);
console.log();

// .......................................................................

console.log("Q : Factorial Calculation");
console.log();
var a = 5,
  fac = 1;
while (a >= 1) {
  fac = fac * a;
  a = a - 1;
}
console.log(fac);
console.log();

// .......................................................................

console.log("Q : Table of any Number");
console.log();
var i = 1,
  num = 50,
  r;
while (i <= 10) {
  r = num * i;
  console.log(num + " * " + i + " = " + r);
  i++;
}
console.log();

// .......................................................................

console.log("Q : Fibonacci numbers");
console.log();
