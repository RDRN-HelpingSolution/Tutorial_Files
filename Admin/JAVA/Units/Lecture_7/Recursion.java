package Units.Lecture_7;

// Class declaration
public class Recursion {

    // 🔁 Recursive method to calculate the factorial of a number
    // This method takes an integer 'n' and returns the factorial of n
    public static int factorial(int n) {

        // ✅ BASE CASE:
        // When n is 0, return 1.
        // This stops the recursion and provides a known result: 0! = 1
        if (n == 0) {
            return 1;
        }

        // 🔁 RECURSIVE CASE:
        // Return n multiplied by the factorial of (n - 1)
        // This breaks the problem into smaller instances
        // Each call goes deeper until the base case is reached
        return n * factorial(n - 1);
    } 

    // 🟢 Main method to run the program
    public static void main(String[] args) {

        // Declare and initialize the number for which we want the factorial
        int number = 5;

        // Call the recursive method with the input number
        // This starts the recursive chain
        int result = factorial(number);

        // Print the final result after all recursive calls return
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

