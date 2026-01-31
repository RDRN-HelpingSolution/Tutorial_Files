package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

// Calculate Power Using Recursion (Another Method with odd & even case) ?

public class Q8 {
    public static int pwrEven(int x,int y){
        if (y==1) {
            System.out.println("\nInside Even");
            return x;
        }
        return 2*pwrEven(x,y/2);
    }
    public static int pwrodd(int x,int y){
        if (y==0) {
            System.out.println("\nInside Odd");
            return x;
        }
        return 2*pwrodd(x,y/2);
    }
    public static void main(String[] args) {

        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        System.out.print("\nTo the Power : ");
        int y=s.nextInt();
        int result;
        if (y==0) {
            result=1;
        } else {
        if (y%2==0) {
            result=2*pwrEven(x, y);
        } else {
            result=pwrodd(x, y);
        }
               }
        System.out.println("\nResult is : "+result+"\n");

    }
}
