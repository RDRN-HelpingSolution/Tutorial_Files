package Challenge;

import java.util.Scanner;

public class c42 {
    public static int userInput() {
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int num=x;
       return num;   
    }
    public static int arrSize() {
        System.out.print("Provide num For Array Size : ");
        int x=userInput();
        return x;
    }
    public static void mainArea(){
        
        int great=0;
        int []Arrnum=new int[arrSize()];
        int i=0;
        while (i<Arrnum.length) {
            System.out.print("Number "+(i+1)+" : ");
            Arrnum[i]=userInput();
            i++;
        }
        int small=Arrnum[0];
        int y=0;
        while (y<Arrnum.length) {
            int c=Arrnum.length;
            while (c>y) {
                int d=c-1;
                int low=0;
                int sum=0;
                while (d>=0) {
                    if (Arrnum[y]<Arrnum[d]) {
                            low++;
                            sum=sum+low;    
                         }
                     d--;
                }
                  c=0;
                  c--;
                 if (Arrnum[y] < small) {
                    small = Arrnum[y];
                                         }    
                 if (sum==0) {
                       great=Arrnum[y];
                             }
                }
           y++;  
        }
        System.out.println();
        System.out.println("Smallest : "+small);
        System.out.println("Greatest : "+great);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Welcome RDRN");
        System.out.println();
        mainArea();
        System.out.println();
    }
}
