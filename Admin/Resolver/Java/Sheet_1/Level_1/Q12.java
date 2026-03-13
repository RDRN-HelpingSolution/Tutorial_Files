package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 12. Print even numbers from 1 to 20 using while loop.

public class Q12 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();

        int i=1;
        System.out.println("\nEven Number Between 1 to "+x+" is: \n");
        while (i<=x) {
            if (i%2==0) {
                System.out.print(" "+i+" ");
            }
            i++;
        }
        System.out.println();
        System.out.println();
    }
}
