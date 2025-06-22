package Challenge;

import java.util.Scanner;

public class c48 {
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
        int r=0;
        int c=0;
        while (r<array2D.length) {
            System.out.println();
            System.out.println("Row : ("+(r+1)+")");
            System.out.println();
            while (c<array2D[r].length) {
                System.out.print("Column ("+(c+1)+") :");
                array2D[r][c]=userInput();
                c++;
            }
            c=0;
            r++;
        }
            System.out.println();
            System.out.println("Your Array is ");
            int a=0;
            int b=0;
            while (a<array2D.length) {
            System.out.println();
            while (b<array2D[a].length) {
                System.out.print(" "+array2D[a][b]+" ");
                b++;
                    }
            b=0;
            a++;
        }
        return array2D;
    }
    public static boolean searching(){
        int[][]forSearch=twoDarray();
        System.out.println();
        System.out.println();
        System.out.print("Provide Number to Search : ");
        int a=userInput();
        int r=0;
        int c=0;
        boolean x=false;
        while (r<forSearch.length) {
            while (c<forSearch[r].length) {
                if (forSearch[r][c]==a) {
                    x=true;
                }
                c++;
            }
            c=0;
            r++;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        boolean g=searching();
        System.out.println();
        if (g==true) {
            System.out.println("Provided number is FOUND in Array");
        } else {
            System.out.println("Provided number is 'NOT' in Array");
        }
      
        System.out.println();
    }
}
