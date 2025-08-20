package Challenge;

import java.util.Scanner;

public class c61 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Multiplication Table");
        Scanner x=new Scanner(System.in);
        System.out.print("\n Provide a Number for Table : ");
        int y=x.nextInt();
        System.out.println();
        for (int i = 1; i <=10; i++) {
            int z=y*i;
            System.out.println(y+" * "+i+" = "+z);
        }
        System.out.println("\nWork Done!");
    }
}
