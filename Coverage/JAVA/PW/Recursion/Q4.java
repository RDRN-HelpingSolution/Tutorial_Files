package Java.PW_Recursion;

import java.util.Scanner;

//Print 1 to N (No Extra Parameter) ?

public class Q4 {
    public static void Counting(int x){
    
        if (x==0) {
            return;
        }
        Counting(x-1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        Counting(x);
    }
}
