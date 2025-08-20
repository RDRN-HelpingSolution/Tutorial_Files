package Challenge;

import java.util.Scanner;

public class c60 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Number Guessing");
        Scanner x=new Scanner(System.in);
        int y;
        int z=23;
        do {
            System.out.print("\n Provide A Number to Check your Guess : ");
            y=x.nextInt();
        } while (y!=z);
        System.out.println("\n Your Guess Worked & Number is : "+y);
    }
}
