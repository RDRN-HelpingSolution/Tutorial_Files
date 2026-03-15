package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 20. Check if a number is a palindrome.

public class Q20 {
    public static void main(String[] args) {
    System.out.println("\nWelcome Roushan Agrawal\n");
    Scanner s=new Scanner(System.in);
    System.out.print("Provide a Number : ");
    int x=s.nextInt();
    System.out.println();

    int revnum=0;
    int y=x;
    int z;
    int a;

    while (y>0) {
        z=y/10;
        a=y%10;
        revnum=revnum*10+a;
        y=z;
    }
    if (x==revnum) {
        System.out.println("\n"+x+" is Palindrome\n");
    } else {
        System.out.println("\n"+x+" is Not Palindrome\n");
    }
    }
}
