// .........................Operator......................................

console.log();
console.log("Operators");

// .........................Assignment Operator...........................

console.log();
console.log("1.Assignment operator_________________________");
console.log();
var x=50, y=12;

console.log("Assignment (=)........................");
console.log("x =",x);
console.log("y =",y);
console.log();

// Addition assignment
console.log("Addition assignment (+=)..............");
console.log(x+=y);
console.log();
// Subtraction assignment
console.log("Subtraction assignment (-=)...........");
console.log(x-=y);
console.log();
// Multiplication assignment
console.log("Multiplication assignment (*=)........");
console.log(x*=y);
console.log();
// Division assignment 
console.log("Division assignment (/=)..............");
console.log(x/=y);
console.log();
// Remainder assignment
console.log("Remainder assignment (%=).............");
console.log(x%=y);
console.log();

// .........................Arithmetic Operator...........................

console.log();
console.log("2.Arithmetic operator ________________________");
console.log();

var x=60,y=11,c;

// Addition
console.log("Addition..............................");
console.log(c=x+y);
console.log();

// Substraction
console.log("Subtraction...........................");
console.log(c=x-y);
console.log();

// Multiplication
console.log("Multiplication........................");
console.log(c=x*y);
console.log();

// Division
console.log("Division..............................");
console.log((c=x/y).toFixed(2));
console.log();

// Modulus
console.log("Modulus...............................");
console.log(c=x%y);
console.log();

// Increment
var x=5;
console.log("Increment.............................");
console.log();
console.log("x= "+x);
console.log();
console.log("Pre Increment");
console.log(++x);
console.log();

var x=5;
console.log("Post Increment");
console.log(x++);
console.log();

// Decrement
var x=5;
console.log("Decrement.............................");
console.log();
console.log("x= "+x);
console.log();
console.log("Pre Decrement");
console.log(--x);
console.log();

var x=5;
console.log("Post Decrement");
console.log(x--);
console.log();

// .........................String Operator...............................
console.log("3.String Operator_______________________________")
console.log();
var x="Roushan",y=" Agrawal";
console.log(x+y);
console.log();

// ......................Comparison Operator..............................
console.log("4.Comparison Operator___________________________");
console.log();
var a=10,b=20,c=10,d=40,e="10",f="A",g="a";

// Equal to (==)
console.log("Equal to..............................");
console.log(a==b);
console.log(a==c);
console.log(a==e);//true (because of type coercion)
console.log();

// Strict equal to (===)
console.log("Strict equal to.......................")
console.log(a===b);
console.log(a===c);
console.log(a===e);// false (because types are different)
console.log();

// Not equal to (!=)
console.log("Not equal to..........................")
console.log(a!=b);
console.log(a!=c);
console.log(a!=e);//False (because of type coercion)
console.log();

// Strict Not equal to (!==)
console.log("Strict Not equal to...................")
console.log(a!==b);
console.log(a!==c);
console.log(a!==e);//true (because of no type coercion)
console.log();

// Greater than (>)
console.log("Greater than (>)......................");
console.log(a>b);
console.log(b>a);
console.log(g>f);
console.log();

// Less than (>)
console.log("Less than (<).........................");
console.log(a<b);
console.log(b<a);
console.log(g<f);
console.log();

// Greater than or equal to (>=)
console.log("Greater than or equal to (>=).........");
console.log(a>=b);
console.log(b>=a);
console.log(a>=c);
console.log();

// Less than or equal to (<=)
console.log("Less than or equal to (<=)............");
console.log(a<=b);
console.log(b<=a);
console.log(a<=c);
console.log();

// ......................Logical Operator.................................

console.log("5.logical Operator____________________________");
console.log();

var a=10,b=20,c=10,d="10",e="10",f=10;

// Logical AND (&&)
console.log("Logical AND (&&)......................");
console.log(a==d&&c==e);
console.log(a!=d&&c!=e);
console.log(a==c&&c==f);
console.log();

// Logical OR (||)
console.log("Logical OR (||).......................")
console.log(a==c||a==b);
console.log(a===d||c===e);
console.log();

// Logical NOT (!)
console.log("Logical NOT (!).......................")
console.log(r=a==c);
console.log(!r);
console.log(m="true");
console.log(!m);

// .........................Ternary Operator..............................
console.log("6.Ternary Operator____________________________");
console.log();

var r, x=54,y=60,z=55,a=60;
r=x==z&&y==a?"both are equal":"both are different"
console.log(r);
console.log();
