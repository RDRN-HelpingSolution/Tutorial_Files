package Challenge;

import java.util.Scanner;
public class c32 {
        public static int userInput(){
                Scanner s=new Scanner(System.in);
                int num=s.nextInt();
                s.close();
                return num;
        }
        public static int lcm(int a,int b){
                int i=1;
                int fac;
                while (true) {
                      fac=i*a;
                      if (fac%b==0) {
                       return fac;
                      } 
                      i++; 
                } 
        }
         public static void main(String[] args) {
                System.out.println();
                System.out.println("Welcome RDRN");
                System.out.println();
                System.out.print("Provide 1st Number: ");
                int a=userInput();
                System.out.print("Provide 2nd Number: ");
                int b=userInput();
                System.out.println();
                lcm(a, b);
                System.out.println("Lcm of "+a+" and "+b+" is: "+lcm(a, b));
        }          
}
