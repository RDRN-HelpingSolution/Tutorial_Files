package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 7. Read two numbers and print the larger one using if-else.

public class Q7 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide 1st Number : ");
        int x=s.nextInt();
        System.out.println();
        System.out.print("Provide 2nd Number : ");
        int y=s.nextInt();
        System.out.println();
        if (x>y) {
            System.out.println(" \" "+x+" \" is Greatest.\n");
        } else {
            System.out.println(" \" "+y+" \" is Greatest.\n");
        }
    }
}
