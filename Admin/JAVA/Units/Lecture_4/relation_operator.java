package Units.Lecture_4;

import java.util.Scanner;

public class relation_operator {
    public static void main(String[] args) {
        
Scanner num1=new Scanner(System.in);
System.out.println("Enter the First Number ");
int a=num1.nextInt();
Scanner num2=new Scanner(System.in);
System.out.println("Enter the Second Number ");
int b=num2.nextInt();
System.out.println();

        System.out.println("a = " + a + ", b = " + b);
        System.out.println();
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println();
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println();
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println();
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println();
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println();
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println();


num1.close();
num2.close();
    }
}
