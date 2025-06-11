package Challenge;

import java.util.Scanner;

public class c31 {

    public static int userinput(){
        System.out.print("Provide a number : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        return n;
    }
    public static void SumDigit(int n){
        int z,r;
        int sum=0;
        int numrer=n;

        while (n>0) {
            z=n%10;
            sum=sum+z;
            r=n/10;
            n=r; 
        }
        System.out.println();
        System.out.println("Sum of The Given Number i.e "+numrer+" is : "+sum);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        SumDigit(userinput());
 
    }
}
