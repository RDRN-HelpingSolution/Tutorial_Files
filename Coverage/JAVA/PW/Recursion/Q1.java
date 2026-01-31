package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

//Factorial of a Number ?

public class Q1 {
    public static int Fact(int x){
        if (x==1) {
            return x;
        }
        return x*Fact(x-1);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome to RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        int result=Fact(x);
        System.out.println("\nResult is : "+result+"\n");
    }
}
