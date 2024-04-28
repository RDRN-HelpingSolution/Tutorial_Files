package Units.Lecture_3;

import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {
    
        Scanner you= new Scanner(System.in);
        System.out.println("\"enter name\"");
        String name = you.nextLine();
        System.out.println("hello, "   + name +  " welcome");
        System.out.println("enter your age");
        int age = you.nextInt();
        System.out.println("Sir, your age is : " + age);
        
        System.out.println("your score ");
        Byte student = you.nextByte();
        System.out.println("Sir, your score is : " + student);

        you.close();



        
        // for middle number

        // Scanner num= new Scanner(System.in);
        // System.out.println("enter number");
        // int numb = num.nextInt();
        // System.out.println("6 " + numb + " 8");
        // num.close();

    }
}
