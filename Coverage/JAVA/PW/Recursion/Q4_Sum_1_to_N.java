package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

public class Q4_Sum_1_to_N {
    // double Parameter
    public static void sum(int num,int sum){
        if (num==0) {
            System.out.println(sum);
            return;
        }
        sum(num-1,sum+num);
    }

    // single parameter
    public static int add(int n){
        if (n==1||n==0) {
            return n;
        }
        return n+add(n-1);
     }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\n\nProvide a Number : ");
        int x=s.nextInt();
        sum(x,0);
        int result=add(x);
        System.out.println("\nResult is : "+result);
    }
}
