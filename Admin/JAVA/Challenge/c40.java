package Challenge;

import java.util.Scanner;

public class c40 {
    public static int userInput1(){
        // System.out.print("Provide a number : ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int num=x;
        return num;
    }
    public static int arrSize(){
       System.out.print("Provide Num Quantity For Sum : ");
       int x=userInput1();
       return x;
    }
    public static void mainArea(){
        int[] marks=new int[arrSize()];
        int i=0;
        while (i<marks.length) {
            System.out.print("Number " + (i + 1) + ": ");
            marks[i] = userInput1();
            i++; 
        }
        int t=0;
        int sum=0;

        while (t<marks.length) {
            int y=marks[t];
            sum=sum+y;
            t++;
            
        }
        System.out.println();
        System.out.println("Sum is : "+sum);
        System.out.println();
        double avg=sum/marks.length;
        System.out.println("Average is : "+avg);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("welcome RDRN");
        System.out.println();
        mainArea();
        System.out.println("  *****Task Completed*****  ");
        System.out.println();

    }
}
