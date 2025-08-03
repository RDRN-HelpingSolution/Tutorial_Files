package Units.Lecture_7;

public class ForEachLoopDemo {
    public static void main(String[] args) {

        // 🌟 NORMAL for-each loop example
        System.out.println("🔁 Normal for-each loop output:");

        // 🧺 Array of fruit names
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // 🧠 The for-each loop automatically goes through each element in the array
        for (String fruit : fruits) {
            // ✅ 'fruit' holds the current value from 'fruits' array
            System.out.println("  Current fruit: " + fruit);
        }

        System.out.println();  // ➖ Line break for clarity


        // 🌟 NESTED for-each loop example
        System.out.println("🔁 Nested for-each loop output:");

        // 🧺 2D array (array of arrays) representing students in classes
        String[][] classes = {
            {"Alice", "Bob"},         // Class 1
            {"Charlie", "David"},     // Class 2
            {"Eve", "Frank"}          // Class 3
        };

        // 🔁 Outer for-each loop → Iterates over each class (which is an array of students)
        for (String[] classGroup : classes) {
            System.out.println("New Class:");

            // 🔁 Inner for-each loop → Iterates over each student in the current class
            for (String student : classGroup) {
                System.out.println("  Student: " + student);
            }

            // 🔄 After inner loop finishes, we move to the next class
        }

        System.out.println();  // ➖ End of program
    }
}

