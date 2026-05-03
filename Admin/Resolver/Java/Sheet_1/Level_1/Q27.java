package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 27. Read two numbers and check if the first is divisible by the second.

public class Q27 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide 1st Number : ");
        int x=s.nextInt();
        System.out.print("\nProvide 2nd Number : ");
        int y=s.nextInt();

        if (x%y==0) {
            System.out.println("\nFirst is divisible by the Second\n");
        } else {
            System.out.println("\nFirst is Not divisible by the Second\n");
        }
    }
}
