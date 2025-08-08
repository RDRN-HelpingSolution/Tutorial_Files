package Units.Lecture_7;

public class DoWhileExample {
    public static void main(String[] args) {
        
        // 🌟 Normal do-while loop
        int count = 1;

        System.out.println("Normal do-while loop:");
        do {
            // ✅ This block will always execute at least once
            System.out.println("  Count is: " + count);

            count++; // 🔁 Increase the counter
        } while (count <= 5); // 🔁 Loop will repeat until count > 5

        System.out.println(); // Line break for clarity






        
        // 🌟 Nested do-while loop example
        int outer = 1;

        System.out.println("Nested do-while loop:");

        do {
            System.out.println("Outer Loop iteration: " + outer); // 📌 Outer loop execution

            int inner = 1;
            

            // Inner do-while starts
            do {
                System.out.println("  Inner Loop iteration: " + inner); // 📌 Inner loop execution
                inner++; // 🔁 Increment inner counter
            } while (inner <= 3); // 🔁 Inner loop runs 3 times for each outer loop iteration

              outer++; // 🔁 Increment outer counter
        } while (outer <= 2); // 🔁 Outer loop runs 2 times

        System.out.println(); // End of program
    }
}

