package Units.Lecture_6.Stack_Heap;

class Animal {
    String type;  // stored in heap (part of object)
}

public class SimpleMemoryExample {
    public static void main(String[] args) {
        int count = 1;               // stored in stack (primitive)
        
        Animal dog = new Animal();  // 'dog' is in stack, object in heap
        dog.type = "Dog";           // stored in heap (inside Animal object)

        System.out.println("Count: " + count);        // from stack
        System.out.println("Animal type: " + dog.type); // from heap
    }
}


// 🧾 Summary
// ✅ Stack: Stores method calls, local primitive variables, and object references.

// ✅ Heap: Stores the actual objects and their data (fields).

// ✅ Objects live longer (until garbage collected). Stack data disappears after method ends.

// ✅ This code shows how both memory areas work together in a real program.