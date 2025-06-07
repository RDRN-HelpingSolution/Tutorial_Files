package Units.Lecture_5;

public class Methods {

    // Method Type 1
    // Static Method with No Parameters and No Return Value
    public static void welcome(){
        System.out.print("Output = ");
        System.out.println("Welcome to Method Example ");
    }

    // Method Type 2
    // Static Method with No Parameters and a Return Value
    public static double piValue(){
        return 3.14159265359;
    }

    // Method Type 3
    // Static Method with Parameters and a Return Value
    public static int add(int a,int b){
    return a+b;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Method Types Demonstration (No Object Required i.e Static Methods)");
        System.out.println();


        System.out.println("Method Type 1");
        System.out.println("---->Static Method with No Parameters and No Return Value ");
        welcome(); //Call Method 1: No parameters, No return
        System.out.println();



        System.out.println("Method Type 2");
        System.out.println("---->Static Method with No Parameters and a Return Value ");
        int r=4;
        double area;
        area=piValue()*r*r; //Call Method 2: No parameters, With return
        System.out.println("Output = "+area);
        System.out.println();

        System.out.println("Method Type 3");
        System.out.println("---->Static Method with Parameters and a Return Value ");
        int result =add(10, 20);// Call Method 3: With parameters, With return
        System.out.println("Output = "+result);    
        int result2 =add(100, 10);// Call Method 3: With parameters, With return
        System.out.println("Output = "+result2);    
        System.out.println();   
    }
}
