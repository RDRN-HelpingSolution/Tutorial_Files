package Units.Lecture_7;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        System.out.println("Ternary Operator Example");
        Scanner s=new Scanner(System.in);
        System.out.println();
        System.out.print("Provide Number : ");
        int x=s.nextInt();
        System.out.print("Provide Score : ");
        int y=s.nextInt();

        int number = x;
        int score = y;

        //todo Simple ternary: Even or Odd

        String parity = (number % 2 == 0) ? "Even" : "Odd";

        //todo Nested ternary: Grade based on score

         String grade = (score >= 90) ? "A" :(score >= 80) ? "B" :(score >= 70) ? "C" :(score >= 60) ? "D" : "F";
        
         // !  String grade = (score >= 90) ? "A" 
        // !                  :(score >= 80) ? "B" 
        // !                  :(score >= 70) ? "C" 
        // !                 :(score >= 60) ? "D" : "F";

        // todo Output both results
        
        System.out.println("Number: " + number + " is " + parity);
        System.out.println("Score: " + score + " # Grade: " + grade);    
    }
}
