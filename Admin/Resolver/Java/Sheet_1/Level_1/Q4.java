package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 4. Input a character and print its ASCII value.

public class Q4 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Alphabet : ");
        char x=s.next().charAt(0);
        int y=(int)x;
        System.out.println("\nASCII Value of ' "+x+" ' is : "+y+"\n");
    }
}
