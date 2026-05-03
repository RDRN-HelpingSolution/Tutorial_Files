package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 30. Read three angles and check if they can form a triangle. 

public class Q30 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.println("\nChecking Angles for Triangle\n");
        System.out.print("\nProvide 1st Angle : ");
        float x=s.nextFloat();
        System.out.print("\nProvide 2nd Angle : ");
        float y=s.nextFloat();
        System.out.print("\nProvide 3rd Angle : ");
        float z=s.nextFloat();

        float a=x+y+z;

        if (a==180) {
            System.out.println("\nProvided Angles Can Form Triangle\n");
        } else {
            System.out.println("\nProvided Angles CanNot Form Triangle\n");
        }

    }
}
