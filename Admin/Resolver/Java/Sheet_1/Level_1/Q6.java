package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 6. Read an integer and print whether it’s even or odd using if-else.

public class Q6 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide  a Integer : ");
        int x=s.nextInt();
        if (x%2==0) {
            System.out.println("\nNumber is EVEN\n");
        } else {
            System.out.println("\nNumber is ODD\n");
        }
    }
    
}
