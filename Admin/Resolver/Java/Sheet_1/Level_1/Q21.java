package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 21. Read three numbers and find the largest. 

public class Q21 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide 1st Number : ");
        int x=s.nextInt();
        System.out.print("\nProvide 2nd Number : ");
        int y=s.nextInt();
        System.out.print("\nProvide 3rd Number : ");
        int z=s.nextInt();
        

        if (x>y&&x>z) {
            System.out.println("\n"+x+" is Greatest\n");
        } else if (y>x&&y>z) {
            System.out.println("\n"+y+" is Greatest\n");
        } else if (x==y&&x==z) {
            System.out.println("\nAll are Same\n");
        }else{
            System.out.println("\n"+z+" is Greatest\n");
        }
        
    }
}
