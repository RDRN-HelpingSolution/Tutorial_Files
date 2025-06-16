package Challenge;

import java.util.Scanner;

public class c39 {
    public static int userInput(){
        System.out.println();
        System.out.print("Provide a Number :");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static void p1(int num){
        int i=1;
        while (num>=i) {
            int x=i;
            while (x>0) {
                 System.out.print(" * ");
                 x--;
            }
            System.out.println();
            i++;
        }
    }
    public static void p2(int num){        
        while (num>0) {
            int x=num;
            while (x>0) {
                System.out.print(" * ");
                x--;
            }
            System.out.println();
            num--;
        }
    }
    public static void p3(int num){
        int f=num;
        int i=1;
        while (num>=i) {
            int x=i;
            f=num;
             while (f>x) {
                    System.out.print("   ");
                    f--;
                }
            while (x>0) {
                 System.out.print(" * ");
                 x--;
                }
            System.out.println();
            i++;
    }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        int number=userInput();
        p1(number);
        System.out.println();
        System.out.println();
        p2(number);
        System.out.println();
        p3(number);
        System.out.println();
}
  }
