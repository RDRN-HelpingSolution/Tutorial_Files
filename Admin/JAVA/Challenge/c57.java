package Challenge;

import java.util.Scanner;

class useInput{
    int takinginput(){
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Month Number : ");
        int providedNum=s.nextInt();

        while (providedNum<=0|providedNum>12) {
            System.out.println("! Invalid Input !");
            System.out.print("Provide a Month Number : ");
                providedNum=s.nextInt();
        }
        return providedNum;
    }
}
class monthYear{
    int monthnum;

    monthYear(int monthnum){
        this.monthnum=monthnum;
    }
    void monthName(){
        System.out.println();
        System.out.println("As Month number is "+monthnum+" , so Month name is ");
        switch (monthnum) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
public class c57 {
   public static void main(String[] args) {
    System.out.println();
    System.out.println("Welcome to Month Name");
    useInput cal1=new useInput();
    System.out.println();
    monthYear cal2=new monthYear(cal1.takinginput());
    cal2.monthName();
    System.out.println();
   } 
}
