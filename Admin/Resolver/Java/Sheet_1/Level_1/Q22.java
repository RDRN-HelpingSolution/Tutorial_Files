package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 22. Check if a number is divisible by both 5 and 11.

public class Q22 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        
        if (x%5==0&&x%11==0) {
            System.out.println("\n"+x+" is Divisible by both 5 & 11."+"\n");
        } else {
            System.out.println("\n"+x+" is NOT Divisible by both 5 & 11."+"\n");
        }

    }
}
