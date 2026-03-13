package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 11. Print numbers from 1 to 10 using a while loop.

public class Q11 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();

        int i=1;
        while (i<=x) {
            System.out.println(i);
            i++;
        }
        System.out.println();
    }
}
