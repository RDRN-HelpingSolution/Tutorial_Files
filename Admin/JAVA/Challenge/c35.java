package Challenge;

import java.util.Scanner;

public class c35 {
    public static int userInput(){
        System.out.print("Provide a Number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static int reverse(int num){
      int x=0;
      while (num>0) {
        int y=num%10;
        x=x*10+y;
        num=num/10;
      }
      return x;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        System.out.println("Reverse is : "+reverse(userInput()));
        System.out.println();

    }
}
