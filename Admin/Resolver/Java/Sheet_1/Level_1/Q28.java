package Admin.Resolver.Java.Sheet_1.Level_1;

import java.util.Scanner;

// 28. Read marks of a student and assign grade (A/B/C/Fail). 

public class Q28 {
    public static void main(String[] args) {
        System.out.println("\nWelcome Roushan Agrawal\n");
        Scanner s=new Scanner(System.in);
        System.out.println("\nProvide Marks of Subjects");
        int a=0,b=0,c=0,d=0,e=0;
        int i=0;
        while (i<=4) {
            if (i==0) {
                System.out.print("\nEnglish : ");
                a=s.nextInt();
            }
            if (i==1) {
                System.out.print("\nHindi : ");
                b=s.nextInt();
            }
            if (i==2) {
                System.out.print("\nMath : ");
                c=s.nextInt();
            }
            if (i==3) {
                System.out.print("\nScience : ");
                d=s.nextInt();
            }
            if (i==4) {
                System.out.print("\nComputer : ");
                e=s.nextInt();
            }
            i++;
        }
        int sum=(a+b+c+d+e);
        float Avg=(sum*100)/500;

        if (Avg>80) {
            System.out.println("\nMarks Got out of 500 is "+sum+"\n");
            System.out.println("\nGrade : \"A\"\n");
        } else if (Avg>60) {
            System.out.println("\nMarks Got out of 500 is "+sum+"\n");
            System.out.println("\nGrade : \"B\"\n");
        } else if (Avg>33) {
            System.out.println("\nMarks Got out of 500 is "+sum+"\n");
            System.out.println("\nGrade : \"C\"\n");
        } else if (Avg<=32) {
            System.out.println("\nMarks Got out of 500 is "+sum+"\n");
            System.out.println("\nYou Failed The Exam\n");
        }
    }
}
