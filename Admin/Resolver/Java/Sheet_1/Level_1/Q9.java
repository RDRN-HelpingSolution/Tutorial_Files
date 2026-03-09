package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 9. Read an integer and print its square.

public class Q9 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();
        System.out.println();
        System.out.println("Square of \" "+x+" \"is : "+(x*x)+"\n");
    }
}
