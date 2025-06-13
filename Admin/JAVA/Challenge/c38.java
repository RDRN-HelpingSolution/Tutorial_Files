package Challenge;

import java.util.Scanner;

public class c38 {
    public static int userInput(){
        System.out.println();
        System.out.print("Provide a Number :");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static int cal(int num){
        int x=1;
        int s=0;
        while (x>0) {
            x=num;
            num=num%10;
            s=s*10+num;
            x=x/10;
            num=x;
        }
        return s;
    } 
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
           int x1=userInput();
           int rf=cal(x1);
        if (x1==rf) {
            System.out.println("Provide Number "+x1+" is Palindrome Number");
        }else{
            System.out.println("Provide Number "+x1+" is Not Palindrome Number");
        }
        System.out.println();
        
    }
       
    }

