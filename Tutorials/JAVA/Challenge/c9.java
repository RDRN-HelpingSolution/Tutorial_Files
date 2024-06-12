package Challenge;

import java.util.Scanner;

public class c9 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Provide 1st Floating number");
        float a=num.nextFloat();
        System.out.println("Provide 2nd Floating number");
        float b=num.nextFloat();
        float c;
        System.out.println(" Two floating points numbers are ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        c=a*b;
        System.out.println("Product is "+c);
num.close();
    }
    
}
