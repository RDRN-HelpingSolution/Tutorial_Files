package Units.Lecture_6.Code_Blocks;

public class CodeBlockDemo {

    // Static Variable
    static int staticCounter;

    // Instance Variable
    int instanceCounter;





    // 1. STATIC BLOCK
    static {
        staticCounter = 100;
        System.out.println("Static Block Executed");
        System.out.println("Static Counter initialized to " + staticCounter);
    }






    // 2. INSTANCE BLOCK
    {
        instanceCounter = 1;
        System.out.println("Instance Block Executed");
        System.out.println("Instance Counter initialized to " + instanceCounter);
    }







    // CONSTRUCTOR
    public CodeBlockDemo() {
        System.out.println("Constructor Called");
        instanceCounter += 10;
        staticCounter += 5;
        System.out.println("Instance Counter updated to: " + instanceCounter);
        System.out.println("Static Counter updated to: " + staticCounter);
    }







    // METHOD CONTAINING LOCAL BLOCK
    public void localBlockExample() {
        System.out.println("Inside Method: localBlockExample");




        //  3. LOCAL BLOCK
        {
            int localValue = 50; // This variable is scoped only within this block
            System.out.println("Local Block Executed");
            System.out.println("Local Variable = " + localValue);
        }

        // localValue is out of scope here; the below line would cause a compile error
        // System.out.println(localValue); 
    }








    // MAIN METHOD
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("MAIN METHOD STARTED");




        // Create first object
        System.out.println("\n--- Creating First Object ---");
        CodeBlockDemo obj1 = new CodeBlockDemo();
        obj1.localBlockExample();




        // Create second object
        System.out.println("\n--- Creating Second Object ---");
        CodeBlockDemo obj2 = new CodeBlockDemo();
        obj2.localBlockExample();



        
        System.out.println("\n MAIN METHOD ENDED");
        System.out.println("===============================");
    }
}

