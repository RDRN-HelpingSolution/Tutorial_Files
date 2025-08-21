package Challenge;

import java.util.Scanner;

public class c63 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to MAX value Finder\n");
        Scanner s=new Scanner(System.in);
        System.out.println("\n First Create an Array");
        System.out.print("\nProvide a value for Index : ");
        int a=s.nextInt();
        int[]arr=new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nValue ["+(arr.length-i)+"] is : ");
            arr[i]=s.nextInt();
        }
        int y;
        int z=0;
        for (int x : arr) {
            y=x;
            if (y>z) {
                z=y;
            }
        }

        System.out.println("\nMaximum Number is : "+z);

    }
}
