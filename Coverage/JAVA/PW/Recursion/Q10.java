package Java.PW_Recursion;

import java.util.Scanner;

// Stair Path ?

public class Q10 {
    // 1 or 3 climb
    public static int Stair1(int x){
        if (x==2||x==3) {
            return x-1;
        }
        if (x==1) {
            return x;
        }
        return Stair1(x-1)+Stair1(x-3);
    }
    // 1 or 2 climb
    public static int Stair(int x){
        if (x==1||x==2) {
            return x;
        }
        return Stair(x-1)+Stair(x-2);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome Rdrn\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide Climbing No 2 or 3 : ");
        int y=s.nextInt();
        System.out.println();
        int result;
             if (y==2) {
            System.out.print("Provide Stair No : ");
            int x=s.nextInt();
            result =Stair(x);
        } 
        else if (y==3) {
            System.out.print("Provide Stair No : ");
            int x=s.nextInt();
            result =Stair1(x);
        }
        else{
            System.out.println("\nSorry ! Try Again");
            result=0;
        }
        System.out.println("\nNo of Ways = "+result+"\n");
    }
}
