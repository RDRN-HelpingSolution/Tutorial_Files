package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

public class Q5_Power_Calculator {
    public static int PowerCal(int a,int b){
        if (b==0) {
            return 1;
        }
        return a* PowerCal(a, b-1);
    } 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide 1st Number : ");
        int x=s.nextInt();
        System.out.print("\nProvide 2nd Number : ");
        int y=s.nextInt();
        int result=PowerCal(x, y);
        System.out.println(result);
    }
}
