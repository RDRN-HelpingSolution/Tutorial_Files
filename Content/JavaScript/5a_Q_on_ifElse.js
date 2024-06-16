//  Q: If the person is 18 years or older ,a citizen,and a registered
//     to vote,display a message saying they are eligible to vote?
console.log("___________________________________________________________");
console.log("Voting Eligible");
console.log();
var age=16,citizen=true,reg=true;
console.log("Your age is = "+age+" Years");
console.log();

if (citizen==true) {
    console.log("You are Citizen of India");
} else {
    console.log("You are not Citizen of India");
}
console.log();

if (reg==true&&age>=18) {
    console.log("You are Registered");
} else {
    console.log("You are not Registered");
}
console.log();

console.log("So,you are: ");
if (age>=18&&citizen==true&&reg==true) {
    console.log("Eligible to vote");
} else {
    console.log("Not Eligible to vote");
}

//  Q: Check Odd or Even ?
console.log("___________________________________________________________");
console.log("Even or Odd Check");
console.log();

var x=11;
console.log("Provided number is = "+x);

if (x%2==0) {
    console.log("Provided number is Even");
} else {
    console.log("Provided number is Odd");
}

//  Q: Number check for + - and zero ?
console.log("___________________________________________________________");
console.log("Check for + - or zero");
console.log();

var num=0;

if (num>0) 
    {
    console.log("Number is Positive");
    }
    else  
    if (num==0) 
        {
          console.log("Number is  Zero");
        }
    else 
    {
    console.log("Number is Negative");
    }

