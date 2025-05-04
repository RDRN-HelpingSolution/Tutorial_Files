package Units.Lecture_5;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

// Q. Print number from 1 to 10 ?

       Scanner numberScanner=new Scanner(System.in);
       System.out.print("Provide a number= ");
       int inputNumber=numberScanner.nextInt();
        while (inputNumber<=10) {
            System.out.println(inputNumber);
            inputNumber++;
        }
       numberScanner.close();

// Q. Print all even numbers between 1 and 50 ?


       Scanner inputScanner=new Scanner(System.in);
       System.out.print("Even Number between= ");
       int inputValue=inputScanner.nextInt();
       Scanner scannerForInput=new Scanner(System.in);
       System.out.print("                    to ");
       int inputHeight=scannerForInput.nextInt();

              inputValue=2;

       while (inputValue%2==0&&inputValue<=inputHeight) {
        System.out.println(inputValue);
        inputValue=inputValue+2;
       }
       inputScanner.close();
       scannerForInput.close();

// Q. Print the multiplication table of a given number ?
       
       Scanner dataInputScanner=new Scanner(System.in);
       System.out.print("Provide a number= ");
       int dataInputNumber=dataInputScanner.nextInt();
        
       int loopCounter=1;
       int loopIndex;
       while (loopCounter<=10) {
        loopIndex=dataInputNumber*loopCounter;
        System.out.println(dataInputNumber+" * "+loopCounter+" = "+loopIndex);
        loopCounter++;
       }

       dataInputScanner.close();

// Q. Calculate the sum of the first n natural numbers ? 

       Scanner userInputScanner=new Scanner(System.in);
       System.out.print("Provide a number= ");
       int userInputValue=userInputScanner.nextInt();
       int counter=1;
       int total=0;
       while (userInputValue>=counter) {
            total=counter+total; 
             counter++; 
       }
       System.out.println(total);
       userInputScanner.close();

// Q. Count down from 100 to 1 ?  


// Q. Count the number of digits in a given positive integer ? 
// Q. Reverse a number ? 
// Q. Calculate the sum of digits of a number ? 
// Q. Check if a number is a palindrome  ? 
// Q. Find the factorial of a number ? 
// Q. Generate the Fibonacci series up to n terms ? 
// Q. Convert a decimal number to binary  ? 
// Q. Find the largest digit in a number ? 
// Q. Remove all digits from a string ? 
// Q. Convert a number to the sum of squares of its digits ? 
// Q. Check if a number is an Armstrong  ? 
// Q. Simulate a login system with 3 chances ? 
// Q. Implement a menu-driven program that continues to run until the user chooses to exit (input-based loop control) ? 
// Q. check whether a number is prime ? 
// Q. Find the GCD of two numbers using Euclidean algorithm ? 
// Q. Continuously take input from the user until a positive integer is entered ? 
// Q. Sort an array using bubble sort logic implemented ? 
// Q. Create a program to simulate a basic ATM interface with options (balance check, deposit, withdraw) ? 
// Q. Print all Armstrong numbers between 1 and 1000 ? 
 
       

    }
}
