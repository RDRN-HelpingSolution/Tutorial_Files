package Challenge;

import java.util.Scanner;

public class c36 {
    public static int userInput(){
        System.out.print("Provide a Position : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static void fibonacci(int num){
        System.out.println("\nFibonacci up to "+num+" Position is : \n");
    
        int y=0;
        int a=0;
        int b=1;
        int c;
        while (num>=y) {
            if (y==0) {
            System.out.print(y+" " ); 
            y++;
            }else if (y==1) {
                System.out.print(y);
                y++;
            }else {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
                y++;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome Rdrn");
        System.out.println();
        fibonacci(userInput());
        System.out.println("\n");
        }
}
