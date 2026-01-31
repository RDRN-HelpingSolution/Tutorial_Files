package Java.PW_Recursion;

import java.util.Scanner;

// Print Sum from 1 to n (Extra Parameter) ?

public class Q5 {

    public static int Add(int x,int sum){
        if (x==0) {
            return sum;
        }
        sum=sum+x;
        return Add(--x, sum);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int x=s.nextInt();
        int sum=0;
        int result=Add(x,sum);
        System.out.println("\nSum is : "+result+"\n");
    }
}
