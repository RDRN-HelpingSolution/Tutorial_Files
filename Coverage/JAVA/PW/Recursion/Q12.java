package Coverage.JAVA.PW.Recursion;

import java.util.Scanner;

// Print Zig-Zag (Pre - Post Concept) ?
//input           output
//1               111
//2               211121112
//3               321112111232111211123
//4               432111211123211121112343211121112321112111234

public class Q12 {
    public static void ZIGzag(int x){
        if (x==0) {
            return;
        }
        System.out.print(" "+x+" ");
        ZIGzag(x-1);
        System.out.print(" "+x+" ");
        ZIGzag(x-1);
        System.out.print(" "+x+" ");
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a Number : ");
        int x=s.nextInt();
        System.out.println("\nOutput is :-\n ");
        ZIGzag(x);
    }
}
