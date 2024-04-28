package Challenge;

import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {

     Scanner sum = new Scanner(System.in);   
        System.out.println("RDRN Calculator");
        System.out.print("First Number: ");
        int n1= sum.nextInt();
        System.out.print("Second Number: ");
        int n2= sum.nextInt();
        int add = n1 + n2 ;
        System.out.println("Sum is: " + add);
        sum.close();
        



// ...............................by self................................

        // System.out.print("Please provide 1st & 2nd numbers for Addition ");
        // Scanner a1 = new Scanner(System.in);
        // Scanner a2 = new Scanner(System.in);

        // int num = a1.nextInt() + a2.nextInt() ;
        // System.out.println("Sum is : " + num);
        // a1.close();
        // a2.close();
    }
}
