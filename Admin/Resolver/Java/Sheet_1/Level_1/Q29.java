package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 29. Read temperature and check if it’s Hot/Cold/Warm.

public class Q29 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide Current Temprature : ");
        float x=s.nextFloat();

        if (x<=15) {
            System.out.println("\nTemprature is Cold\n");
        } 
        else if (x>=15&&x<=30) {
            System.out.println("\nTemprature is Moderate\n");
        }
        else {
            System.out.println("\nTemprature is Hot\n");
        }
    }
}
