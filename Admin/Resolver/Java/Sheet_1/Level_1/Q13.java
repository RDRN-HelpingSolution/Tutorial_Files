package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 13. Print numbers from 10 to 1 using while.

public class Q13 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();
        System.out.println();

        int i=1;
        while (x>=i) {
            System.out.println(x);
            x--;
        }
        System.out.println();
    }
}
