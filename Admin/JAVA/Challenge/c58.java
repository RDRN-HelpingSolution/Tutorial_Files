package Challenge;

import java.util.Scanner;

public class c58 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Simple Calculator");
        Scanner s=new Scanner(System.in);
        System.out.println("\nProvide two Numbers for Calculation\n");
        System.out.print("1st Number : ");
        int x=s.nextInt();
        System.out.print("2nd Number : ");
        int y=s.nextInt();
        System.out.println();
        System.out.println("What Calculation You Want\n");
        System.out.println("......For Addition Press        \" A \" .....");
        System.out.println("......For Substraction Press    \" S \" .....");
        System.out.println("......For Multiplication Press  \" M \" .....");
        System.out.println("......For Division Press        \" D \" .....\n");
        System.out.print("Provide Desired Calculation : ");
        String z=s.nextLine();;
               z=s.nextLine();
               
               int Result= switch(z){
                case "A" -> x+y;
                case "S" ->x-y;
                case "M" ->x*y;
                case "D" ->x/y;
                default ->-123;
              };

// * Another way with Yield

            //   int Result= switch(z){
            //     case "A" -> {
            //         int add=x+y;
            //         yield add;
            //     }

            //     case "S" -> {
            //         int sub=x-y;
            //         yield sub;
            //     }

            //     case "M" -> {
            //         int Mul=x*y;
            //         yield Mul;
            //     }

            //     case "D" -> {
            //         int Div=x/y;
            //         yield Div;
            //     }

            //      default ->-123;
            //   };

              System.out.println("\nYou opt for "+z);
              System.out.println("Result is "+Result);
              System.out.println();
        




        


    }
}
