package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

// Maze Path ?
public class Q11 {
    public static int Maze(int r,int c){
        if (r==1||c==1) {
            return 1;
        }
        return Maze(r-1, c)+Maze(r, c-1);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("Provide No of Row : ");
        int r=s.nextInt();
        System.out.print("\nProvide No of Col : ");
        int c=s.nextInt();
        int result=Maze(r, c);
        System.out.println("\nNo of Ways : "+result+"\n");
    }
}
