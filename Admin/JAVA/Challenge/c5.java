package Challenge;

import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("please enter your name");
        String you = name.nextLine();
        System.out.println("Welcome " + you + " to KG Coding");
        name.close();
    }
}
