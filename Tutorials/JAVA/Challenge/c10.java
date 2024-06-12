package Challenge;

import java.util.Scanner;

public class c10 {
    public static void main(String[] args) {
        System.out.println("Perimeter of rectangle Calculator");
        Scanner num=new Scanner(System.in);
        System.out.println("Provide the length ");
        int x=num.nextInt();
        System.out.println("Provide the breadth ");
        int y=num.nextInt();
        int z=2*(x+y);
        System.out.println();
        System.out.println("Perimeter of rectangle with length= "+x+" & breadth= "+y+ " is "+z);
    
    num.close();
    }
}
