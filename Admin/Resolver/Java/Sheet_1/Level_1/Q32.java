package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 32. Read 10 integers and print their sum.

public class Q32 {
     public static void main(String[] args) {
          System.out.println("\nWelcome Roushan Agrawal\n");
          Scanner s=new Scanner(System.in);
          System.out.println("\nCreating an Array with 10 Integer\n");
          int[]num=new int[10];
          System.out.println("\nTaking Input.....\n");
          int i=0;
          while (i<num.length) {
               System.out.print("\n"+(i+1)+" Number : ");
               num[i]=s.nextInt();
               i++;
          }
          System.out.println("\nAll Input Received\n");
          int sum=0;
          int x=0;
          while (x<num.length) {
               sum=sum+num[x];
               x++;
          }
          System.out.println("\nSum of All Input Array Is : "+sum+"\n");
          System.out.println("\n........ Task Completed........\n");
     }
}
