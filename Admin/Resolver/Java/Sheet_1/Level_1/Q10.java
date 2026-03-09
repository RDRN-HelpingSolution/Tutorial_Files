package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 10. Read a number and check whether it's positive, negative, or zero. 

public class Q10 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();
        System.out.println();
        if (x==0) {
            System.out.println(" \" "+x+" \" is Zero.\n");
        }else if (x>0) {
            System.out.println(" \" "+x+" \" is Positive.\n");
        }else {
            System.out.println(" \" "+x+" \" is Negative.\n");
        }
    }
}
