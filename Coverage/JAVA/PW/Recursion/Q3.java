package Java.PW_Recursion;

import java.util.Scanner;

//Print 1 to N (Extra Parameter) ? 

public class Q3 {

    public static void Counting(int x ,int y){

        if (y>x) {
            return;
        }
        System.out.println(y);
        Counting(x,++y);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        int y=1;
        Counting(x,y);
    }
}
