
// .........................IF..Else Statement............................

console.log("________________________________________________________");
console.log();
console.log("IF..Else Statement......................................");
console.log();

var day="monday";
if (day=="sunday") {
    console.log("School is Closed");
} else {
    console.log("School is Open");
}

// .........................Switch Statement............................

console.log();
console.log("________________________________________________________");
console.log();
console.log("Switch Statement........................................");
console.log();
var operation = "/"
var num1 = 10;
var num2 = 5;
var result;

switch(operation) {
    case "+":
        result = num1 + num2;
        console.log("Addition result:", result);
        break;
    case "-":
        result = num1 - num2;
        console.log("Subtraction result:", result);
        break;
    case "*":
        result = num1 * num2;
        console.log("Multiplication result:", result);
        break;
    case "/":
        result = num1 / num2;
        console.log("Division result:", result);
        break;
    default:
        console.log("Invalid operation");
}
console.log();

// .........................loop..........................................

// .........................While loop....................................

console.log();
console.log("________________________________________________________");
console.log();
console.log("while loop..............................................");
console.log();

// .......................................................................

console.log("Q : Display Numbers From 1 to 11");
console.log();
var num=1;
while (num<=11) {
    console.log(num);
    num++;
}
console.log();


// .........................do While loop.................................

console.log();
console.log("________________________________________________________");
console.log();
console.log("Do while loop...........................................");
console.log();

// while loop

var counte = 1;
while (counte<=0) {
      console.log("Count is: " + counte);
  counte++;
}

console.log();
console.log();

// do while loop


var count = 1;

do {
  console.log("Count is: " + count);
  count++;
} while (count <= 0);

// both codes are same but output will differ.


// .........................For loop......................................

console.log();
console.log("________________________________________________________");
console.log();
console.log("For loop................................................");
console.log();

// Q:  check prime number

console.log();
console.log("Prime Number check");
console.log();



// Q:   Print Numbers From 1 to 5

console.log();
console.log("Print Numbers From 1 to 5");
console.log();

for (let i = 1; i < 6; i++) {
    console.log(i);
}
    









