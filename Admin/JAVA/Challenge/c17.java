package Challenge;

import java.util.Scanner;

public class c17 {
    public static void main(String[] args) {
        System.out.println();
        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);
        Scanner num3=new Scanner(System.in);

        System.out.println("Please provide following Numbers ");
        System.out.println();
        System.out.print("First Number = ");
        int x=num1.nextInt();
        System.out.println();
        System.out.print("Second Number = ");
        int y=num2.nextInt();
        System.out.println();
        System.out.print("Third Number = ");
        int z=num3.nextInt();
        System.out.println();

        if (x>y&&x>z) {
             System.out.println("Provided Value of 1st Number = "+ x +" is Greatest");
        } 
         else if (y>x&&y>z) {
             System.out.println("Provided Value of 2nd Number = "+ y +" is Greatest");
         }
        else {
            System.out.println("Provided Value of 3rd Number = "+ z +" is Greatest");
        }
System.out.println();

    num1.close();
    num2.close();
    num3.close();
    }
}
