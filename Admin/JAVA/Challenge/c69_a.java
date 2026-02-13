package Challenge;

import java.util.Scanner;

public class c69_a {
    public static int Palindrome(int x,int z){
        if (x/10==0) {
            return z*10+x;
        }
        return Palindrome(x/10, z*10+x%10);
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome RDRN\n");
        Scanner s=new Scanner(System.in);
        System.out.print("\nProvide a number : ");
        int x=s.nextInt();
        int z=0;
        int y=Palindrome(x,z);
        if (x==y) {
            System.out.println("\nProvided Number "+x+" is Palindrome");
        } else {
            System.out.println("\nProvided Number "+x+" is NOT Palindrome");
        }
        System.out.println();
    } 
}
