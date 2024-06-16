package Challenge;

import java.util.Scanner;

public class c14 {
    public static void main(String[] args) {
        System.out.println("Fahrenheit to Celsius calculator");
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Fahrenheit Temperature");
        float f=a.nextFloat();
        double c=(f-32)*(0.555);
        System.out.println("Provided Fahrenheit is "+f+" degree");
        System.out.println("In Celsius "+c+" degree");
        a.close();
    }
}
