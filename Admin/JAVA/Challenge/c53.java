package Challenge;

import java.util.Scanner;

public class c53 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Minimum Finder");
        Scanner numInput=new Scanner(System.in);
        System.out.println();
        System.out.println("Provide Numbers For Comparison");
        System.out.println();
        System.out.print("1st Number : ");
        int num1=numInput.nextInt();
        System.out.print("2nd Number : ");
        int num2=numInput.nextInt();

        int min=(num1>num2)?num2:num1;

        System.out.println();
        System.out.println("Minimum Among "+num1+" and "+num2+" is : "+min);
        System.out.println();


    }
    
}
