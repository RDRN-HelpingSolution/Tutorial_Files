package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 15. Print the sum of numbers from 1 to N.

public class Q15 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();
        System.out.println();

        int sum=0;
        int i=1;
        while (i<=x) {
            sum=sum+i;
            i++;
        }
        System.out.println("\n Sum From 1 to "+x+" = "+sum+"\n");
    }
}
