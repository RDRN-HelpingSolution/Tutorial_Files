package Units.Lecture_6.Primitive_Reference;

public class SimpleExample {
    public static void main(String[] args) {

        // 🔹 Primitive type
        int number = 10;
        // 'number' is stored in STACK memory with value 10

        // 🔹 Reference type (String is an object)
        String greeting = "Hello";
        // 'greeting' is a reference stored in STACK
        // "Hello" string object is stored in HEAP

        // 🔹 Reference type (Array is an object)
        int[] marks = {90, 80, 70};
        // 'marks' is a reference stored in STACK
        // The array [90, 80, 70] is stored in HEAP

        // 🔸 Output the values
        System.out.println("Primitive Type:");
        System.out.println("Number: " + number);

        System.out.println("\nReference Types:");
        System.out.println("Greeting: " + greeting);
        System.out.println("Marks[1]: " + marks[1]);
    }
}



// ✅ Stack Memory:

// Variable	    Value
// number	        10 (primitive)
// greeting	    ➡️ reference to "Hello" (in heap)
// marks	        ➡️ reference to array [90, 80, 70] (in heap)

// ✅ Heap Memory:

// Object	        Content
// "Hello"	        String object
// Array	        [90, 80, 70]

