package Challenge;

import java.util.Scanner;

public class c68 {

    static int Fabonacci(int n){

        if (n==0 || n==1) {
            return n;
        }
        int x=Fabonacci(n-1);
        int y=Fabonacci(n-2);
        int c=x+y;
        return c;
    } 
    public static void main(String[] args) {
        System.out.println("\nWelcome to Fabonacci Series");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int num=s.nextInt();
        int result=Fabonacci(num);
        System.out.println(result);
        System.out.println("end");
        
        



    }
}
