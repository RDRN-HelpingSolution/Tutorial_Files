package Challenge;

import java.util.Scanner;

public class c47 {
    public static int userInput(){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int num=a;
        return num;
    }
    public static int arrSize(){
        System.out.print("Provide Number for Array Size : ");
        int a=userInput();
        return a;
    }
    public static int[] arrInput(){
        int[]forArray=new int[arrSize()];
        int i=0;
        while (i<forArray.length) {
             System.out.print("Number ("+(i+1)+") : ");
             forArray[i]=userInput();
             i++;
        }
        int[]finalArray=forArray;
        return finalArray;
    }
    public static int[] mainArea(){
        System.out.println("For First Array");
        System.out.println();
        int []first=arrInput();
        System.out.println();
        System.out.println("For Second Array");
        System.out.println();
        int []second=arrInput();
        System.out.println();
        int []merged=new int[first.length+second.length];
        int b=0;
        int c=0;
        int d=0;
      
        while (b<first.length||c<second.length) {
            if (c==second.length||
               (b<first.length&&
                first[b]<second[c])) {
               merged[d] = first[b];
                    b++;
                    d++; 
            }
            else {
               merged[d]=second[c];
                    d++;
                    c++;
            }               
        }
        return merged;
    }
     public static void Result(){
        int[]out=mainArea();
        System.out.println();
        int l=0;
        while (l<out.length) {
            System.out.print(" "+out[l]+" ");
            l++;
        }
        }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        Result();
        System.out.println();
    }
}
