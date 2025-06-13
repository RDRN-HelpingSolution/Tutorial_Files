package Challenge;

import java.util.Scanner;

public class c37 {
    public static int userInput(){
        System.out.print("Pronide a Number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static int power(int f){
        int s=0;
        while (f>0) {
            f=f/10;
            s++;
        }
        return s; 
    }
    public static int cube(int n,int f){
        int a=1;
        int x=1;
        while (a<=power(f)) {
            x=x*n;
            a++;
        }
        return x;
    }
    public static int rous(int num){
        int f=num;
        int r=0;
        int n=num;
        int x=num;
        while (x>0) {
            n=n%10;
            r=cube(n,f)+r;
            x=x/10;
            n=x; 
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        int x1=userInput();
        int rf=rous(x1);
        
        if (x1==rf) {
            System.out.println("Provide Number "+x1+" is Armstrong Number");
        }else{
            System.out.println("Provide Number "+x1+" is Not Armstrong Number");
        }
        System.out.println();
        
    }
}
