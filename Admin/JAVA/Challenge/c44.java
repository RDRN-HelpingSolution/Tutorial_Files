package Challenge;

import java.util.Scanner;

public class c44 {
    public static int userInput(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int num=x;
        return num;
    }
    public static int arrSize(){
        System.out.print("Provide Array Size : ");
        int a=userInput();
        return a;
    }
    public static int[] arrInput(){
        int[]rArray=new int[arrSize()];
        int i=0;
        while (i<rArray.length) {
            System.out.print("Number ("+(i+1)+") : ");
            rArray[i]=userInput();
            i++;
        }
        return rArray;
    }
    public static void mainArea(){
        int[]editArr=arrInput();
        System.out.print("Number to Delete : ");
        int b=userInput();
        int d=0;
        int e=0;
        while (d<editArr.length) {
            if (editArr[d]==b) {
                e++;
            }
            d++; 
        }
        int f=0;
        if (e<=1) {
             f=editArr.length-e;
        } else {
            f=(editArr.length-e)+1;
        }
       

        int[]newArr =new int[f];
        int i=0;
        int j=0;
        while (i<=newArr.length&&j<newArr.length) {
            if (editArr[i]!=b) {
                newArr[j]=editArr[i];
                 j++;
            }
            i++;
        }
        System.out.println("After Delete");
        int k=0;
        while (k<newArr.length) {
            if (newArr[k]!=0) {
                 System.out.print(" "+newArr[k]+" ");
            }
            k++;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome RDRN");
        System.out.println();
        mainArea();
        System.out.println();
    }
}
