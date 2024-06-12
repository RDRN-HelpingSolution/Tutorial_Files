package Challenge;

import java.util.Scanner;

public class c8 {
    public static void main(String[] args) {
            Scanner num = new Scanner(System.in); 
            System.out.println("value of a= ");
            int a=num.nextInt();
            System.out.println("value of b= ");
            int b=num.nextInt();
            int c;
            System.out.println("Arithmetic operators applying on a & b" );
            System.out.println("a= "+a);
            System.out.println("b= "+b);
            c=a+b;
            System.out.println("Addition = "+c);
            System.out.println();
             
            System.out.println("a= "+a);
            System.out.println("b= "+b);
            c=a-b;
            System.out.println("Substraction = "+c);
            System.out.println();

            System.out.println("a= "+a);
            System.out.println("b= "+b);
            c=a*b;
            System.out.println("Multiplication = "+c);
            System.out.println();

            System.out.println("a= "+a);
            System.out.println("b= "+b);
            c=a/b;
            System.out.println("Division = "+c);
            System.out.println();

            System.out.println("a= "+a);
            System.out.println("b= "+b);
            c=a%b;
            System.out.println("Modulus = "+c);

            num.close();
    }
}
    
    
    

