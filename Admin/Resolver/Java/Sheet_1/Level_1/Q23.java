package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 23. Read a character and check if it’s a vowel.

public class Q23 {
     public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          System.out.println("\nWelcome Roushan Agrawal\n");
          System.out.print("Provide a Character : ");
          char c = s.next().charAt(0);
          if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
               System.out.println("\nProvided Character \'"+c+"\' is Vowel\n");
          } 
          else if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
               System.out.println("\nProvided Character \'"+c+"\' is Vowel\n");
          }
          else {
               System.out.println("\nProvided Character \'"+c+"\' is Not Vowel\n");
          }

     }
}
