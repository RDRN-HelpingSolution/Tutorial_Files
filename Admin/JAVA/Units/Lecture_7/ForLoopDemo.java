package Units.Lecture_7;

public class ForLoopDemo {
    public static void main(String[] args) {

        // 🌟 NORMAL FOR LOOP EXAMPLE
        System.out.println("Normal for loop output:");

        // 🧠 This loop will run from i = 1 to i = 5 (inclusive)
        for (int i = 1; i <= 5; i++) {
            // ✅ Initialization: int i = 1  → starting point
            // ✅ Condition: i <= 5         → loop continues while this is true
            // ✅ Update: i++               → i is increased by 1 after each iteration

            System.out.println("  Iteration " + i + ": Hello, world!");
        }

        System.out.println();  // ➖ Line break for clarity


        // 🌟 NESTED FOR LOOP EXAMPLE
        System.out.println("Nested for loop output:");

        // 🧠 Outer loop: represents rows or repetitions of a group
        for (int outer = 1; outer <= 3; outer++) {
            // This is the outer iteration
            System.out.println("Outer Loop - Round " + outer);

            // 💡 Inner loop: runs completely every time the outer loop runs once
            for (int inner = 1; inner <= 2; inner++) {
                // This is the inner iteration inside the outer iteration
                System.out.println("  Inner Loop - Step " + inner);
            }

            // 🔄 After inner loop completes, outer loop goes to the next value
        }

        System.out.println();  // ➖ End of program spacing
    }
}

