package Challenge;

import java.util.Scanner;

public class c27 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Even or Odd using bitwise operators.");
        System.out.println();
        Scanner num=new Scanner(System.in);
        System.out.print("Provide a Number = ");
        int pnum=num.nextInt();

        int x=1;
        int z=pnum&x;
        System.out.println();
       
        if (z==1) {
            System.out.println("Provided Number "+pnum+" is Odd");
        } else {
            System.out.println("Provided Number "+pnum+" is Even");
        }
        System.out.println();



        num.close();

    }
}
