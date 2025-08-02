package Challenge;

import java.util.Scanner;

class userInput{
    int fromUser(){
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number: ");
        int userNum=s.nextInt();

        while (userNum<=0) {
            System.out.println();
            System.out.println("! Invalid Input");
            System.out.println();
            System.out.print("Provide a Number: ");
            userNum=s.nextInt();
        }
        return userNum;
    }
}
class scoreFinder{
    int score;
    scoreFinder(int score){
        this.score=score;
    }
    void finalScore(){
        String y=(score>80)?"High":(score<=80&&score>=50)?"Moderate":"Low";
        System.out.println("Student's Score is "+score);
        System.out.println("So it is Categorize As : "+y);
    }
}
public class c56 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to Student Performance");
        System.out.println();
        userInput cal1=new userInput();
        scoreFinder cal2=new scoreFinder(cal1.fromUser());
        cal2.finalScore();
        System.out.println();
    }
}
