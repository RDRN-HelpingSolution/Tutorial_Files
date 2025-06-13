package Challenge;

import java.util.Scanner;

public class c38 {
    public static int userInput(){
        System.out.println();
        System.out.print("Provide a Number ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        s.close();
        return num;
    }
    public static 
    public static void main(String[] args) {
        System.out.println();
        int num=121;
        int x=1;
        int s=0;
        while (x>0) {
            x=num;
            num=num%10;
            s=s*10+num;
            x=x/10;
            num=x;
        }
    }
}
