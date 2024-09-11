package Challenge;

import java.util.Scanner;

public class c18 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println();
        System.out.println("Leap Year Or Not Machine ");
        System.out.println();
        System.out.print("Enter Year = ");
        int x=num.nextInt();
        System.out.println();

        if (x%400==0||(x%100!=0&&x%4==0)) {
            System.out.println("Provided Year "+ x +" is a Leap year");
        } else {
            System.out.println("Provided Year "+ x +" is Not a Leap year");
        }
        System.out.println();
num.close();
    }
}
