package Units.Lecture_6.this_keyword_use;





// 1. Referring to current class instance variables
class StudentThis {
    String name;
    int rollNo;

    StudentThis(String name, int rollNo) {
        this.name = name;      // Use of this to refer to instance variable
        this.rollNo = rollNo;
    }

    void showDetails() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}








// 2. Invoking current class method
class MethodCaller {
    void greet() {
        System.out.println("Hello from greet()");
    }

    void callGreet() {
        this.greet();  // Use of this to call method
    }
}









// 3. Invoking current class constructor
class Book {

    // Instance variables
    String title;
    int edition;

    // Default constructor
    Book() {
        this("Untitled", 1);  // Constructor chaining
        System.out.println("Default constructor executed");
    }

    // Parameterized constructor
    Book(String title, int edition) {
        this.title = title;
        this.edition = edition;
        System.out.println("Parameterized constructor executed");
        System.out.println("   Title  : " + this.title);
        System.out.println("   Edition: " + this.edition);
    }

    // Method to display book details
    void display() {
        System.out.println("Book Info:");
        System.out.println("   Title  : " + title);
        System.out.println("   Edition: " + edition);
    }
}








// 4. Passing current object as method argument
    class Gold {
        String quality;
        double weight;

        // Constructor
        Gold(String quality, double weight) {
            this.quality = quality;
            this.weight = weight;
        }

        // Method creates Printer and passes 'this' (current object)
        void sendToPrinter() {
            Printer p = new Printer();   //  Printer created internally
            p.printDetails(this);        //  Passing current Gold object
        }
    }

    //  Printer class
    class Printer {
        void printDetails(Gold g) {
            System.out.println("Gold Details:");
            System.out.println("Quality: " + g.quality);
            System.out.println("Weight: " + g.weight + " grams");
        }
    }








// 5. Returning current class instance from a method (Method Chaining)
class ChainedSetter {
    String brand;
    double price;

    ChainedSetter setBrand(String brand) {
        this.brand = brand;
        return this;  // Use of this to return current object
    }

    ChainedSetter setPrice(double price) {
        this.price = price;
        return this;
    }

    void showProduct() {
        System.out.println("Brand: " + brand + ", Price: ₹" + price);
    }
}









// 6. Accessing outer class instance from inner class
class OuterThisExample {
    int outerValue = 100;

    class InnerClass {
        int outerValue = 200;

        void showValues() {
            System.out.println("Inner value: " + this.outerValue);
            System.out.println("Outer value: " + OuterThisExample.this.outerValue);
        }
    }
}






// ================== MAIN CLASS ==================
public class ThisExamples {
    public static void main(String[] args) {

        // 1. Referring to instance variables
        System.out.println("1.Referring to instance variables");
        System.out.println();
        StudentThis s = new StudentThis("Roushan", 101);
        s.showDetails();
        System.out.println();
        System.out.println("...............................");





        // 2. Calling method using this
        System.out.println("2.Calling method using this");
        System.out.println();
        MethodCaller m = new MethodCaller();
        m.callGreet();
        System.out.println();
        System.out.println("...............................");







        // 3. Constructor chaining using this()
        System.out.println("3.Constructor chaining using this()");
        System.out.println();
        System.out.println("Creating Book 1 using default constructor:");
        Book book1 = new Book();  // Uses default constructor → calls parameterized
        book1.display();

        System.out.println("Creating Book 2 using parameterized constructor:");
        Book book2 = new Book("Java Programming", 3);  // Direct call to parameterized
        book2.display();
        System.out.println();
        System.out.println("...............................");








        // 4. Passing current object using this
        System.out.println("4.Passing current object using this");
        System.out.println();
       // Creating Gold object
        Gold g1 = new Gold("24K", 50.75);

        // Calling method to send current object to Printer
        g1.sendToPrinter();  // ✅ No need to pass Printer manually
        System.out.println();
        System.out.println("...............................");








        // 5. Returning this for method chaining
        System.out.println("5.Returning this for method chaining");
        System.out.println();
        ChainedSetter cs = new ChainedSetter();
        cs.setBrand("Samsung").setPrice(49999).showProduct();
        System.out.println();
        System.out.println("...............................");








        // 6. Accessing outer class instance from inner class
        System.out.println("6.Accessing outer class instance from inner class");
        System.out.println();
        OuterThisExample outer = new OuterThisExample();
        OuterThisExample.InnerClass inner = outer.new InnerClass();
        inner.showValues();
        System.out.println();
        System.out.println("...............................");
    }
}

