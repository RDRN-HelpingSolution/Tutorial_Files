package Units.Lecture_4;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {

// .............................Even or Odd..................................

    System.out.println();    
    System.out.println("1. Even or Odd ");
    System.out.println();
        Scanner num=new Scanner(System.in);
        System.out.println("Please Provide a Number ");
        int n=num.nextInt();
        if (n%2==0) {
            System.out.println("Entered number "+n+" is even");
        } else {
            System.out.println("Entered number "+n+" is odd");
        }


// ...................... Positive, Negative, or Zero........................



    System.out.println();
    System.out.println("2. Positive, Negative, or Zero ");
    System.out.println();
     Scanner numb=new Scanner(System.in);
     System.out.println("Please Provide a Number ");
     int m=numb.nextInt();

     if (m>0) {
        System.out.println("Entered number "+m+" is Positive");

     } else if (m==0) {
        System.out.println("Entered number "+m+" is zero");

     }else{
        System.out.println("Entered number "+m+" is Negative");

     }


// .......................... Max of Two Numbers............................

System.out.println();
System.out.println("3. Max of Two Numbers");
System.out.println();

Scanner num1=new Scanner(System.in);
System.out.println("Enter the First Number ");
int x=num1.nextInt();
Scanner num2=new Scanner(System.in);
System.out.println("Enter the Second Number ");
int y=num2.nextInt();
System.out.println();

if (x>y) {
    System.out.println(x+" is Greatest");
} else {
    System.out.println(y+" is Greatest");
}


num1.close();
num2.close();
num.close();
numb.close();


      }
    
    }


