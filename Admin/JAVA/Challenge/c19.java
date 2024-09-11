package Challenge;

import java.util.Scanner;

public class c19 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println();
        System.out.print("Please Provide Marks Percentage = ");
        int x=num.nextInt();
        System.out.println();

        if (x>90&&x<=100) {
            System.out.println("As you got "+ x +" % in Exam.");
            System.out.println();
            System.out.println("So,you got GRADE \"A\".");
        } 
        else if (x>75&&x<=100) {
            System.out.println("As you got "+ x +" % in Exam.");
            System.out.println();
            System.out.println("So,you got GRADE \"B\".");
        }
        else if (x>60&&x<=100) {
            System.out.println("As you got "+ x +" % in Exam.");
            System.out.println();
            System.out.println("So,you got GRADE \"C\".");
        }
        else if (x>=30&&x<=100) {
            System.out.println("As you got "+ x +" % in Exam.");
            System.out.println();
            System.out.println("So,you got GRADE \"D\".");
        }
        else if (x<30&&x<=100) {
            System.out.println("As you got "+ x +" % in Exam.");
            System.out.println();
            System.out.println("So,Sorry you have \"FAILED\" the Exam");
        }
        else {
            System.out.println("Please Enter VALID Percentage");
        
        }
        System.out.println();
    num.close();
    }
}
