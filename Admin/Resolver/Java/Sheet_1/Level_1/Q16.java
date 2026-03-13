package Admin.Resolver.Java.Sheet_1.Level_1;

// 16. Read a number N and print the factorial of N using while.

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();
        System.out.println();

        int i=1;
        int pro=1;

        while (i<=x) {
            pro=pro*i;
            i++;
        }
        System.out.println("\nFactorial of "+x+" = "+pro+"\n");
    }
}
