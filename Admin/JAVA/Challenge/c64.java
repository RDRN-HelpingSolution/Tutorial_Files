package Challenge;

import java.util.Scanner;

public class c64 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Repetation Finder");
        Scanner s=new Scanner(System.in);
        System.out.println("\nCreating an Array");
        System.out.print("\nProvide a Size for Array : ");
        int a=s.nextInt();
        int[]arr=new int[a];
        for (int i = 0,k=1; i < a; i++,k++) {
            System.out.print("\nValue ["+k+"] : ");
            arr[i]=s.nextInt();
        }
        System.out.print("\nProvide a Value for Repetation Finder : ");
        int l=s.nextInt();
        int p=0;
        for (int f : arr) {
            if (f==l) {
                p++;
            }
        }
        System.out.println("\nRepetation Number for "+l+" is : "+p);
    }
}
