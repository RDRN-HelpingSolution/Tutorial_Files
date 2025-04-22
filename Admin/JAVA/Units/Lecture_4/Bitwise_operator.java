package Units.Lecture_4;

public class Bitwise_operator {
    public static void main(String[] args) {
System.out.println("Bitwise operators in Java____________");
System.out.println();
System.out.println("1. Bitwise AND (&)");
System.out.println();
int a = 5;  // binary: 0101
int b = 3;  // binary: 0011
int result1 = a & b; // binary: 0001 => decimal: 1
System.out.println("Result is "+result1); // Output: 1
System.out.println();

System.out.println("_____________________________________");
System.out.println();

System.out.println("2. Bitwise OR (|)");
System.out.println();
int result2 = a | b; // binary: 0111 => decimal: 7
System.out.println("Result is "+result2); // Output: 7

System.out.println();

System.out.println("_____________________________________");
System.out.println();

System.out.println("3. Bitwise XOR (^)");
System.out.println();
int result3 = a ^ b; // binary: 0110 => decimal: 6
System.out.println("Result is "+result3); // Output: 6

System.out.println();

System.out.println("_____________________________________");
System.out.println();

System.out.println("4. Bitwise NOT (~)");
System.out.println();
int x = 5;      // binary: 00000000 00000000 00000000 00000101
int result4 = ~x; // result: 11111111 11111111 11111111 11111010 (two's complement of -6)
System.out.println("Result is "+result4); // Output: -6


System.out.println();

System.out.println("_____________________________________");
System.out.println();
System.out.println("5. Bitwise Left Shift (<<)");
System.out.println();
int y = 4;
        int result5 = y << 1; // This is like 4 * 2

        System.out.println("Before shift: " + y);
        System.out.println("After shift (y << 1): " + result5);

System.out.println();
System.out.println();

System.out.println("_____________________________________");
System.out.println();
System.out.println("6. Bitwise Right Shift (>>)");
System.out.println();
int number = 6;
int shift = 1;

int result6 = number >> shift;

System.out.println("Number: " + number);
System.out.println("Shift by: " + shift);
System.out.println("Result after >> : " + result6);

System.out.println();
System.out.println();

System.out.println("_____________________________________");
System.out.println();
System.out.println("7. Unsigned Right Shift (>>>) ");
System.out.println();
int z = -6;

System.out.println("Original (z): " + z);
System.out.println("x >> 2  = " + (z >> 2));
System.out.println("x >>> 2 = " + (z >>> 2));

System.out.println();
System.out.println();

    }
}
