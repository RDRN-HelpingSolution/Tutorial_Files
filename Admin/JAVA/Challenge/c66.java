package Challenge;

import java.util.Scanner;

public class c66 {
    public static void main(String[] args) {
        System.out.println("\nUse of Continue Statement");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide how many Values to Sum : ");
        int a=s.nextInt();
        int u=0;
        for (int i = 1; i <=a; i++) {
            System.out.print("\n Value "+i+" : ");
            int f=s.nextInt();
            if (f<1) {
                continue;
            }
            u=u+f;
        }
        System.out.println("\nAfter Removing all Negative Values");
        System.out.println("\nResult is : "+u+"\n");
    }
}
