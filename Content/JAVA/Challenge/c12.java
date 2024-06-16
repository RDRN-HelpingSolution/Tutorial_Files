package Challenge;

import java.util.Scanner;

public class c12 {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculator");
        Scanner num=new Scanner(System.in);
        System.out.println("Provide the Principle Amount ");
        int x=num.nextInt();
        System.out.println("Provide the Time in years ");
        int y=num.nextInt();
        System.out.println("Provide the Rate of Interest ");
        int z=num.nextInt();
        int r=(x*y*z)/100;
        System.out.println();
        System.out.println("Simple Interest with Principle Amount= "+x+" , Time in years= "+y+" & Rate of Interest= "+z+ " is Rs:"+r);
    
    num.close();
    }
}
