package Challenge;

import java.util.Scanner;

public class c28 {
    
    public static int inputNum(){
        System.out.print("Provide Number = ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        s.close();
        return x;
        
    }
     public static void table(int x){
     System.out.println();
     System.out.println("Multiplication Table of "+x+" is:");
     int i=1;
     while (i<=10) {
        int z=x*i;
        System.out.println(x+" * "+i+" = "+z);
        i++;
     }
     }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
         table(inputNum());
        //  table(inputNum());
        
    }
}
