package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

public class Q3_Print_1_to_N {
    public static void Counting(int num){
        if (num==0) {
            return;
        }
        Counting(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\n\nProvide a Number : ");
        int x=s.nextInt();
        Counting(x);
    }  
}
