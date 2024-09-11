package Challenge;

import java.util.Scanner;

public class c20 {
     public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println();
        System.out.print("Please Provide Your Age = ");
        int x=num.nextInt();
        System.out.println();

        if (x<13&&x<=120) {
            System.out.println("As your Age is "+ x);
            System.out.println();
            System.out.println("So,you are Under \"CHILD\" category.");
        } 
        else if (x<20&&x<=120) {
            System.out.println("As your Age is "+ x);
            System.out.println();
            System.out.println("So,you are Under \"TEEN\" category.");
        }
        else if (x<60&&x<=120) {
            System.out.println("As your Age is "+ x);
            System.out.println();
            System.out.println("So,you are Under \"ADULT\" category.");
        }
        else if (x>=60&&x<=120) {
            System.out.println("As your Age is "+ x);
            System.out.println();
            System.out.println("So,you are Under \"Senior\" category.");
        }
        else {
            System.out.println("Please Enter VALID AGE ");
        
        }
        System.out.println();
    num.close();
    }
}
