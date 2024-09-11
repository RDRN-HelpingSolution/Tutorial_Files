package Challenge;

import java.util.Scanner;

public class c15 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
       
        System.out.print("Please provide a number = ");
        int x=num.nextInt();
        System.out.println();
        if (x>0) {
            System.out.println("Provided number is positive");
        } 
        else if (x==0) {
            System.out.println("Provided number is zero");    
        }
        else {
            System.out.println("Provided number is negative");
        }         
        System.out.println();
    num.close();
    }
}
