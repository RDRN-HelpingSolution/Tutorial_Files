package Challenge;

import java.util.Scanner;

public class c65 {
    public static void main(String[] args) {
        System.out.println("\nBreak Keyword Problem");
        Scanner s=new Scanner(System.in);
        while (true) {
                System.out.print("\nProvide a Word : ");
                String i=s.nextLine();
                if (i.equals("exit")) {
                    break;
                } 
            }
        System.out.println("\nYou Exited using \"BREAK\" ! Come Again.\n");

    }
}
