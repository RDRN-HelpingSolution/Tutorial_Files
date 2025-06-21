package Challenge;

import java.util.Scanner;

public class c46 {
    public static int userInput(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int num=a;
        return num;
    }
    public static int arrSize(){
        System.out.print("Provide Number for Array Size : ");
        int a=userInput();
        return a;
    }
    public static int[] arrInput(){
        int[]forReverse=new int[arrSize()];
        int i=0;
        while (i<forReverse.length) {
             System.out.print("Number ("+(i+1)+") : ");
             forReverse[i]=userInput();
             i++;
        }
        return forReverse;
    }
    public static void mainArea(){
        int[]toReverse=arrInput();
        int[]afterReverse=new int[toReverse.length];
        int b=0;
        int c=toReverse.length-1;
        while (b<toReverse.length) {
            afterReverse[b]=toReverse[c];
            b++;
            c--;
        }
        int d=0;
        int f=0;
        boolean e=false;
        while (d<toReverse.length) {
                e=true;
            if (toReverse[d]!=afterReverse[f]) {
                e=false;
                f=0;
            }
            d++;
            f++;   
        }
        System.out.println();
        if (e==true) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is Not Palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        mainArea();
        System.out.println();
    }
}
