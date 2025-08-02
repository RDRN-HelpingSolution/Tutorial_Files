package Challenge;

import java.util.Scanner;

 class userInput1{
        int inputNum(){
            Scanner s=new Scanner(System.in);
            System.out.print("Provide a Number : ");
            int providedNum=s.nextInt();
            return providedNum;
        }
    }
    class calculator{
        int x;  
        calculator(int x){
            this.x=x;
        }
        void checker(){
            String y=(x%2==0)?"Even":"Odd";
            System.out.println("Provided number [ "+x+" ] is :"+y);
        }
    }
public class c54 {
   
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to Odd & Even Finder");
        System.out.println();
        userInput1 called1=new userInput1();
        calculator called2=new calculator(called1.inputNum());
        System.out.println();
        called2.checker();
        System.out.println();
    }
}
