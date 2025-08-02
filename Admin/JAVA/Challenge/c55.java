package Challenge;

import java.util.Scanner;


class numProvider{
    int userNum(){
        Scanner s=new Scanner(System.in);
        System.out.print("Provide a Number : ");
        int gotNum=s.nextInt();
        return gotNum;
    }
}
class absolute{
    int x;

    absolute(int x){
        this.x=x;
    }

    void calculatorAbsoulte(){
        int y=(x>0)?x:
              (x<0)?(x*(-1)):0;
        System.out.println("Absolute Value of [ "+x+" ] is :"+y);
    }
}
public class c55 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Absolute Value Calculator");
        System.out.println();
        numProvider cal1=new numProvider();
        absolute cal2=new absolute(cal1.userNum());
        System.out.println();
        cal2.calculatorAbsoulte();
        System.out.println();
    }
}
