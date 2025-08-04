package Units.Lecture_7;

public class BreakContinueAllInOne {
    public static void main(String[] args) {

        // -----------------------------------------------
        // 🌟 1. Normal loop with 'break'
        System.out.println("1 Normal for loop with 'break':");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("   Breaking loop at i = " + i);
                break;  // Exits loop when i == 5
            }
            System.out.println("  i = " + i);
        }

        System.out.println(); // Line break


        // -----------------------------------------------
        // 🌟 2. Normal loop with 'continue'
        System.out.println("2 Normal for loop with 'continue':");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("   Skipping i = " + i);
                continue;  // Skips the current iteration
            }
            System.out.println("  i = " + i);
        }

        System.out.println(); // Line break


        // -----------------------------------------------
        // 🌟 3. Nested loop with 'break'
        System.out.println("3 Nested loop with 'break' (inner loop only):");

        for (int outer = 1; outer <= 2; outer++) {
            System.out.println("Outer loop: " + outer);
            for (int inner = 1; inner <= 5; inner++) {
                if (inner == 3) {
                    System.out.println("   Breaking inner loop at inner = " + inner);
                    break;  // Exits inner loop only
                }
                System.out.println("  Inner loop: " + inner);
            }
        }

        System.out.println(); // Line break


        // -----------------------------------------------
        // 🌟 4. Nested loop with 'continue'
        System.out.println("4 Nested loop with 'continue' (inner loop only):");

        for (int outer = 1; outer <= 2; outer++) {
            System.out.println("Outer loop: " + outer);
            for (int inner = 1; inner <= 5; inner++) {
                if (inner == 2) {
                    System.out.println("   Skipping inner = " + inner);
                    continue;  // Skips rest of current inner iteration
                }
                System.out.println("  Inner loop: " + inner);
            }
        }

        System.out.println(); // Line break


        // -----------------------------------------------
        // 🌟 5. Nested loop with labeled 'break'
        System.out.println("5 Nested loop with labeled 'break' (exit both loops):");

        outerBreak:
        for (int outer = 1; outer <= 3; outer++) {
            System.out.println("Outer loop: " + outer);
            for (int inner = 1; inner <= 5; inner++) {
                if (inner == 4) {
                    System.out.println("   Breaking both loops at inner = " + inner);
                    break outerBreak;  // Exits both loops
                }
                System.out.println("  Inner loop: " + inner);
            }
        }

        System.out.println(); // Line break


        // -----------------------------------------------
        // 🌟 6. Nested loop with labeled 'continue'
        System.out.println("6 Nested loop with labeled 'continue' (skip to next outer loop):");

        outerContinue:
        for (int outer = 1; outer <= 3; outer++) {
            System.out.println("Outer loop: " + outer);
            for (int inner = 1; inner <= 5; inner++) {
                if (inner == 2) {
                    System.out.println("   Skipping rest of this outer iteration at inner = " + inner);
                    continue outerContinue;  // Skips to next outer iteration
                }
                System.out.println("  Inner loop: " + inner);
            }
            System.out.println("  → This line is skipped if 'continue outerContinue' is triggered");
        }

        System.out.println("\n Program completed.");
    }
}

