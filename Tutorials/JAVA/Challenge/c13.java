package Challenge;

import java.util.Scanner;

public class c13 {
    public static void main(String[] args) {
        System.out.println("Compound Interest Calculator");
        Scanner num=new Scanner(System.in);
        System.out.println("Provide the Principle Amount ");
        float x=num.nextInt();
        System.out.println("Provide the Time in years ");
        float y=num.nextInt();
        System.out.println("Provide the Rate of Interest ");
        float z=num.nextFloat();
        double r=x*Math.pow((1+z/100),y);
        System.out.println();
        System.out.println("Compound Interest with Principle Amount= "+x+" , Time in years= "+y+" & Rate of Interest= "+z+ " is Rs:"+r);
    
    num.close();
}
}