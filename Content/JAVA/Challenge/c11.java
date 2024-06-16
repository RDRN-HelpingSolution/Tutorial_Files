package Challenge;

import java.util.Scanner;

public class c11 {
    public static void main(String[] args) {
        System.out.println("Area of Triangle Calculator");
        Scanner num=new Scanner(System.in);
        System.out.println("Provide the Base ");
        int x=num.nextInt();
        System.out.println("Provide the Height ");
        int y=num.nextInt();
        double z=(0.5)*x*y;
        int r=(int)z;
        System.out.println();
        System.out.println("Area of Triangle with Base= "+x+" & Height= "+y+ " is "+r);
    
    num.close();
    }
}
