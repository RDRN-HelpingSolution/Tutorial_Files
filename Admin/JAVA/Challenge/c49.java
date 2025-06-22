package Challenge;

import java.util.Scanner;

public class c49 {
    public static int userInput(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int num=x;
        return num;
    }
    public static int rowValue(){
        System.out.print("Provide Value for Row : ");
        int row=userInput();
        return row;
    }
    public static int columnValue(){
        System.out.print("Provide Value for Column : ");
        int column=userInput();
        return column;
    }

    public static int[][] twoDarray(){
        int x=rowValue();
        int y=columnValue();
        int[][]array2D=new int[x][y];
        System.out.println("Provide Values for Array");
        int r=0;
        int c=0;
        while (r<array2D.length) {
            System.out.println("ROW : "+(r+1));
            while (c<array2D[r].length) {
                System.out.print("Column [ "+(c+1)+" ] : ");
                array2D[r][c]=userInput();
                c++;
            }
            c=0;
            r++;
        }
        System.out.println();
        System.out.println("Your 2D Array ");
        int r1=0;
        int c1=0;
        while (r1<array2D.length) {
            System.out.println();
            while (c1<array2D[r1].length) {
                System.out.print(" "+array2D[r1][c1]+" ");
                c1++;
            }
            c1=0;
            r1++;  
        }
        return array2D;
    }
    public static void sumAverage(){
        int[][]cal=twoDarray();
        int r1=0;
        int c1=0;
        int sum=0;
        double digit=0;
        while (r1<cal.length) {
            while (c1<cal[r1].length) {
                sum=cal[r1][c1]+sum;
                digit++;
                c1++;
            }
            c1=0;
            r1++;  
        }
        System.out.println();
        System.out.println();
        System.out.println("sum = "+sum);
        double avg=sum/digit;
        System.out.println("Average = "+avg);

    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        sumAverage();
        System.out.println();
    }
}
