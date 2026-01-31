package Java.PW_Recursion;

import java.util.Scanner;

// Fibonacci Using Recursion ? 

public class Q9 {
    public static int Fibonacci(int x){
        if (x==0) {
            return x;
        }
        if (x==1) {
            return x;
        }
        return Fibonacci(x-1)+Fibonacci(x-2);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        int result=Fibonacci(x);
        System.out.println("\nResult is : "+result+"\n");
    }
}
