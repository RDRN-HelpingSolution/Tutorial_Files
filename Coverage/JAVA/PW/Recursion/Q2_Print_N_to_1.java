package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

public class Q2_Print_N_to_1 {
    public static void Counting(int num){
        if (num==1) {
            System.out.print("\n "+num);
            return;
        }
        System.out.print("\n "+num);
        Counting(num-1);
        
  
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\n\nProvide a Number : ");
        int x=s.nextInt();
        Counting(x);
    }
}
