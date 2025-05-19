package Units.Lecture_5;
public class MathUtils {

    // User-defined method
    public int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        MathUtils obj = new MathUtils();  // Creating object of the class
        int result = obj.square(5);       // Calling the method with input 5
        System.out.println("Square is: " + result);  // Output: Square is: 25
    }
}


