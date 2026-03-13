package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 18. Read a number and count how many digits it has. 

public class Q18 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();

        int count=0;
        int y=x;
        while (x>0) {
           x=x/10;
           count++; 
        }
        System.out.println("\nNo of digits in "+y+" = "+count+"\n");
    }
}
