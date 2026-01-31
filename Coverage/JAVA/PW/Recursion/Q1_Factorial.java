package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

public class Q1_Factorial {
    public static int Fact(int num){
        if (num==1) {
            return num;
        }
        return num*Fact(num-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        int result=Fact(x);
        System.out.println("\nResult is : "+result);
    }
} 