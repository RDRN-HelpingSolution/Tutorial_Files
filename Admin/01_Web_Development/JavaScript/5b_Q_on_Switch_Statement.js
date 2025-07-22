// Q: Write a JavaScript switch statement that takes a 
//    variable areaOfShapes representing
//    different shapes, and based on its value,  
//    calculates and logs the area of the corresponding
//    shape. Consider three shapes: 'Rectangle,' 'Circle,' 
//    and 'Square.' For 'Rectangle,' use variables a
//    and b as the sides; for 'Circle,' use a variable r as 
//    the radius; and for 'Square,' use variable a as the
//    side length. If the provided shape is not recognized, 
//    log a message saying, 'Sorry the shape is not
//    available.' Test your switch statement with areaOfShapes 
//    set to 'Square' and sides a and b set to
//    5 and 10, respectively. Ensure that the correct 
//    area (25 in this case) is logged to the console.
console.log();
console.log("_____________________________________________________________");
console.log(" Q: Area of Shape.......................................");
console.log();

var area="trian";
l=10,b=20,h=30;
switch (area) {
    case "circle":
        r=20
        console.log("You want to find area of circle with radius "+r);
        console.log();
        A=3.14159*r*r
        console.log("So Area will be = "+A);
        break;
    
    case "square":
        console.log("You want to find area of square with sides "+l);
        console.log();
        A=l*l
        console.log("So Area will be = "+A);

        break;
        
    case "triangle":
        console.log("You want to find area of Triangle with base = "+b +" and height = "+h);
        console.log();
        A=0.5*b*h;
        console.log("So Area will be = "+A);
 
        break;

    case "rectangle":
        console.log("You want to find area of Rectangle with length = "+l +" and Breadth = "+b);
        console.log();
        A=b*l;
        console.log("So Area will be = "+A);
        break;

    case "rhombus":
        console.log("You want to find area of Rhombus with base = "+b +" and height = "+h);
        console.log();
        A=b*h;
        console.log("So Area will be = "+A);
        break;

        break;
        
    default:
        console.log("You have entered "+area);
        console.log("Sorry the shape is not available !");
        break;
}



// Q: Get Month name by numbers.

console.log();
console.log("_____________________________________________________________");
console.log(" Q: Get Month name by numbers...........................");
console.log();

var num=89;
console.log("You have entered "+num+" as Month Number");
console.log();
switch (num) {
    case 1:
        console.log("So Month name is January");
        break;

    case 2:
        console.log("So Month name is February");
        break;

    case 3:
        console.log("So Month name is March");
        break;

    case 4:
        console.log("So Month name is April");
        break;

    case 5:
        console.log("So Month name is May");
        break;


    case 6:
        console.log("So Month name is June");
        break;

    case 7:
        console.log("So Month name is July");
        break;

    case 8:
        console.log("So Month name is August");
        break;

    case 9:
        console.log("So Month name is September");
        break;

    case 10:
        console.log("So Month name is October");
        break;

    case 11:
        console.log("So Month name is November");
        break;

    case 12:
        console.log("So Month name is December");
        break;

    default:
        console.log("Sorry ! Please enter valid Month number again..");
        break;
}