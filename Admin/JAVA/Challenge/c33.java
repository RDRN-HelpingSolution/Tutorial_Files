package Challenge;

import java.util.Scanner;

public class c33 {
    public static int userInput(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static int goa(int a,int b){
        if (a>b) {
            return b;
        } else {
            return a;
        }
    }
    public static int gcd(int a,int b){
        int i=1;
        int r=1;
        while (i<=goa(a, b)) {
            if (a%i==0&&b%i==0) {
             r=i;
            }
           i++; 
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        System.out.print("Provide 1st Number: ");
        int a=userInput();
        System.out.println();
        System.out.print("Provide 2nd Number ");
        int b=userInput();
        goa(a, b);
        gcd(a,b);
        System.out.println();
        System.out.println("HCF of "+a+" and "+b+" is = "+gcd(a, b));
        System.out.println();
    }
}
