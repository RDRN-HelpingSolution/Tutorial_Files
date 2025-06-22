package Challenge;

import java.util.Scanner;

public class c50 {
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

    public static int[][] twoDarray(int u1,int u2){
        int a=u1;
        int b=u2;
        int[][]array2D=new int[a][b];
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
    public static void even(int e1,int e2){
        int[][]dig=twoDarray(e1,e2);
        int r=0;
        int c=0;
        int c2=dig.length-1;
        int sum =0;
        while (r<(dig.length)) {
           sum=dig[r][c]+sum;
           sum=dig[r][c2]+sum;
           r++;
           c++;
           c2--;
        }
        System.out.println();
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println();


    }
    public static void odd(int o1,int o2){
        int[][]dig=twoDarray(o1,o2);
        int r=0;
        int c=0;
        int c2=dig.length-1;
        int sum =0;
        while (r<(dig.length)) {
            if (dig[r][c]==dig[r][c2]) {
                sum=dig[r][c]+sum;
            } else {
                sum=dig[r][c]+sum;
                sum=dig[r][c2]+sum;
            } 
           r++;
           c++;
           c2--;
        }
        System.out.println();
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println();


    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        int x=rowValue();
        int invalid=1;
        int y=columnValue();
        while ((x==invalid)||(x!=y)) {
            System.out.println();
            System.out.println("***********ERROR***********");
            System.out.println();
            if (x==invalid) {
                System.out.println("Provide  Value More than 1 ");
            } else {
                System.out.println("Provide same Value for Both");
            }
            System.out.println();
            x=rowValue();
            y=columnValue();
        }
        System.out.println();
        if (x%2==0) {
            even(x, y);
        } else {
            odd(x, y);
        }
    }
}
