package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 8. Take a float input and print it rounded to the nearest whole number.

public class Q8 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        Float x=s.nextFloat();
        System.out.println("\nNearest Whole Number to \" "+x+" \" is : "+Math.round(x));
        System.out.println();
    }
}
