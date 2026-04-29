package Admin.Resolver.Java.Sheet_1.Level_1;
import java.util.Scanner;

// 25. Read a number and check if it’s in the range 10 to 100.

public class Q25 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide A Desired Number : ");
        int x=s.nextInt();
        if (x>=10&&x<=100) {
            System.out.println("\nProvide Number is in Range\n");
        }else{
            System.out.println("\nProvide Number is Not in Range\n");
        }
    }
}
