package Challenge;

import java.util.Scanner;

public class c62 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Prime number Finder");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        boolean r=true;
        for (int i = 2; i < x; i++) {
            if (x%i==0) {
            r=false; 
            }
        }
        if (r==true) {
            System.out.println("\nNumber is Prime\n");
        } else {
            System.out.println("\nNumber is NOT Prime\n");
        }
    }
}
