package Challenge;

import java.util.Scanner;

public class c34 {
    public static int userInput(){
        System.out.print("Provide a Number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static boolean prime(int x){
        int i=2;
        boolean r=true;
        if (x<=1) {
            r=false;
        }else{
        while (i<x) {
            if (x%i==0) {
                r=false;
            }
            i++;    
                    }
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        // System.out.println("Provide No for Prime is "+prime(userInput()));
        boolean e=prime(userInput());
        System.out.println();
        if (e==true) {
            System.out.println("Number is PRIME");
        }else{
              System.out.println("Number is not PRIME");
        }
        System.out.println();
        }
    }

