package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 31. Read 5 integers into an array and print them.

public class Q31 {
     public static void main(String[] args) {
          System.out.println("\nWelcome Roushan Agrawal\n");
          Scanner s=new Scanner(System.in);
          System.out.println("Creating a Array with 5 Integer");
          int[]num=new int[5];
          System.out.println("\nTaking Input for 5 Integer\n");
          int i=0;
          while (i<num.length) {
               System.out.print("\n"+(i+1)+" Number : ");
               num[i]=s.nextInt();
               i++;
          }
          System.out.println("\nAll Input Done\n");
          System.out.println("\nPrinting......\n");

          int x=0;
          while (x<num.length) {
               System.out.println(num[x]);
               x++;
          }

          System.out.println("\n........Task Completed........\n");
     }
}
