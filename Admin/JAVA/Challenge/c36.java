package Challenge;

import java.util.Scanner;

public class c36 {
    public static long userInput(){
        System.out.print("Provide a Number : ");
        Scanner s=new Scanner(System.in);
        long num=s.nextLong();
        s.close();
        return num;
    }
    public static void fibonacci(long num){
        long x=0L;
        long y=1L;
        long z=0L;
        long b=0L;
        if (num<=230) {
            if (num<=0) {
            System.out.println("0");
        } else {
        System.out.print("Fibonacci Series up to "+num+" is : 01");
        while ((x+y)<=num) {
           z=x+y;
        if (z<10) {
         b=b*10;
      } else if (z<99) {
         b=b*100;
       }else if (z<999) {
         b=b*1000;
       }else{
         b=b*10000;
       }
            b=b+z;
           x=y;
           y=z;
        }
        System.out.print(b);
    }
        } else {
            System.out.println("Provided no is more than 230");
            System.out.println(" Sorry ! ");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome Rdrn");
        System.out.println();
        fibonacci(userInput());
        System.out.println();
         }
}
