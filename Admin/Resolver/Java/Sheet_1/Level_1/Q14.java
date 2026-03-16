package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 14. Print the first 10 multiples of 5.

public class Q14 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a number : ");
        int x=s.nextInt();
        System.out.println();
        
        int i=1;
        int m;
        while (i<=10) {
            m=i*x;
            System.out.println(x+" * "+i+" = "+m);
            i++;
        }
        System.out.println();
    }
}
