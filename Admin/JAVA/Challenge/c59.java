package Challenge;

import java.util.Scanner;

public class c59 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Password Checker\n");
        Scanner s=new Scanner(System.in);
        String x;
        int c=6;
        do {
            System.out.print("Provide A Password : ");
            x=s.nextLine();
        } while (x.length()<=c);
        System.out.println("\nPassword is "+x);



        // String x=s.nextLine();
        //  int x;
        // do {
        //     System.out.print("Provide a Password : ");
           
        //     x=s.nextInt();

        // } while (x<=0);
    }
}
