package Challenge;

import java.util.Scanner;

public class c29 {
    public static int userInput(){
        System.out.print("Provide a Number = ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        return n;

    }

    public static void oddnum(int n){
        int i=1;
        int z=0;
        System.out.println();
        System.out.print("Odd Number Between "+i+" to "+n+" is : ");
        while (i<=n) {
            if (i%2!=0) {
                z=z+i;  
                System.out.print(" "+i+" ");
            } 
            i++;
        }
     System.out.println();
     System.out.println();
     System.out.println("Sum of Odd number Between 1 to "+n+" is "+z); 
     System.out.println();
    }
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        oddnum(userInput());
        // oddnum(userInput());

    }
}
