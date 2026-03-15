package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 19. Reverse  the digits of a given number using while.

public class Q19 {
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

    System.out.println("\nReverse of "+x+" is : "+revnum+"\n");

    }
}
