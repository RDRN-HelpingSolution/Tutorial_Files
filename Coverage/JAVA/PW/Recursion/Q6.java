package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

// Print Sum from 1 to n (No Extra Parameter) ?

public class Q6 {
 
    public static int Add(int x){
        if (x==1) {
            return x;
        }
        return x+Add(--x);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();
        int result=Add(x);
        System.out.println("\nSum is : "+result+"\n");
    }
} 
