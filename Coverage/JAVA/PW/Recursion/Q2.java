package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

//Counting N to 1 ?

public class Q2 {
    public static void Counting(int x){
        if (x==0) {
            return;
        }
        System.out.print("\t"+x+"\t");
        Counting(x-1);
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        Counting(x);
    }
}
