package Challenge;

import java.util.Scanner;

public class c30 {
    public static int userInput(){
        System.out.print("Provide a Number = ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        return n;
    }

    public static void factorial(int n){
        int i=1;
        int z=1;
        while (i<=n) {
               z=z*i;
               i++;   
        }
        System.out.println();
        System.out.println("Factorial of "+n+"! is "+z);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        factorial(userInput());

    }
}
