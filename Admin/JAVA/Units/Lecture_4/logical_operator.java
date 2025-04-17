package Units.Lecture_4;

public class logical_operator {
    public static void main(String[] args) {
        
System.out.println();
System.out.println("1. AND Operator (&&)....................");
System.out.println();        
        boolean a = true;
        boolean b = false;

if (a && b) {
    System.out.println("Both are true");
} else {
    System.out.println("At least one is false");  // This line will be executed
}

System.out.println();
System.out.println("2. OR Operator (||).....................");
System.out.println();  
        boolean c = true;
        boolean d = false;

if (c || d) {
    System.out.println("At least one is true");  // This line will be executed
} else {
    System.out.println("Both are false");
}

System.out.println();
System.out.println("3. NOT Operator (!).....................");
System.out.println(); 
        boolean e = false;

if (!e) {
    System.out.println("e is false");
} else {
    System.out.println("e is true");  // This line will be executed
}

System.out.println();
System.out.println("4. XOR Operator (^).....................");
System.out.println(); 
        boolean f = false;
        boolean g = true;

if (f ^ g) {
    System.out.println("Exactly one is true");  // This line will be executed
} else {
    System.out.println("Both are the same");
}

System.out.println();
System.out.println();


    }
}
