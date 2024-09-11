package Challenge;

import java.util.Scanner;

public class c16 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println();
        System.out.print("Please provide a Number = ");
        int x=num.nextInt();
        System.out.println();
        if (x%2==0) {
            System.out.println("Provided number is Even");
        } else {
            System.out.println("Provided number is Odd");
        }
        System.out.println();


    num.close();
    }
}
