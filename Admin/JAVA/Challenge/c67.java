package Challenge;

import java.util.Scanner;

public class c67 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to EVEN NUMBER Printing");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number for Printing from : " );
        int x=s.nextInt();
        System.out.print("\t\t\t     up to : ");
        int y=s.nextInt();
        System.out.println("\nPrinting All EVEN Numbers Between "+x+" and "+y+".");
        for (int i = x; i <=y; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
