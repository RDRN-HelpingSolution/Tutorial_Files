package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 26. Check if a person is eligible to vote (age ≥ 18).

public class Q26 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide Age Of Candidate : ");
        int x=s.nextInt();
        if (x>=18) {
            System.out.println("\nYou are Eligible to Vote\n");
        } else {
            System.out.println("\nYou are Not Eligible to Vote\n");
            int y=18-x;
            System.out.println("\nYou Will be Eligible After "+y+" Years.\n");
        }
    }
}
