package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 24. Read a year and check if it’s a leap year.

public class Q24 {
     public static void main(String[] args) {
          System.out.println("\nWelcome Roushan Agrawal\n");
          Scanner s=new Scanner(System.in);
          System.out.print("\nProvide a Number : ");
          float x=s.nextFloat();
          
          if (x%400==0||(x%100!=0&&x%4==0)) {
               System.out.println("\nProvided Year \""+x+"\" is Leap Year.\n");
          }
          else {
              System.out.println("\nProvided Year \""+x+"\" is Not a Leap Year.\n"); 
          }
     
}
}
