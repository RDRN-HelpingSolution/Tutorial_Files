package Challenge;

import java.util.Scanner;

public class c43 {
    public static int userInput(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int num=x;
        return num;
    }
    public static int arrSize(){
        System.out.print("Provide Array Size : ");
        int x=userInput();
        return x;
    }
    public static boolean arrayInput(){
        int[]sorting=new int[arrSize()];
        int i=0;
        while (i<sorting.length) {
            System.out.print("Number ("+(i+1)+") : ");
            sorting[i]=userInput();
            i++;  

        }
        int a=0;
        int b=1;
        boolean c=false;
         boolean f=false;
        while (b<sorting.length) {
                c=false;
            if (sorting[a]<=sorting[b]) {
                c=true;
            }else if (c==true) {
                return c;
            } else {
                 int d=0;
                 int e=1;
           
            while (e<sorting.length) {
                f=false;
                if (sorting[e]<=sorting[d]) {
                f=true;
                }else {  
                return c;
                }
                d++;
                e++;
            }
                }
            a++;
            b++;
        }
       if (c=true) {
        return c;
       }else{
        return f;
       }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        boolean r=arrayInput();
        System.out.println();
        if (r==true) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
            
        }
        System.out.println();
    }
}
