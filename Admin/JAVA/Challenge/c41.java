package Challenge;

import java.util.Scanner;

public class c41 {
    public static int userInput(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int num=x;
        return num;
    }
    public static int arrSize(){
        System.out.print("Provide Num for size : ");
       int x=userInput();
       return x;
    }
    public static void userMain(){
        int[]pnum=new int[arrSize()];
        int i=0;
        while (i<pnum.length) {
            System.out.print("Number "+(i+1)+" : ");
            pnum[i]=userInput();
            i++;
        }
        System.out.println();
        System.out.print("Provide num for Check :");
        int f=userInput();
        int y=0;
        int z=0;
        while (y<pnum.length) {
            if (pnum[y]==f) {
                z++;
            }
            y++; 
        }
        System.out.println();
        System.out.println("Provided Num Found "+z+" times.");
    }
    public static void main(String[] args) {
        System.out.println("Welcome RDRN");
        System.out.println();
        userMain();
        System.out.println();
    }
}
