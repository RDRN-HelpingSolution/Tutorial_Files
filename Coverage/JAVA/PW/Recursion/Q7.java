package Java.PW_Recursion;

import java.util.Scanner;

// Calculate Power Using Recursion ?

public class Q7 {

    public static int power(int x,int y){
        if (y==0) {
            return 1;
        }
        if (y==1) {
            return x;
        }
        return x*power(x,y-1);
    }
    public static void main(String[] args) {

        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        System.out.print("\nTo the Power : ");
        int y=s.nextInt();
        
        int result=power(x, y);
        System.out.println("\nResult is : "+result+"\n");
    }
}
