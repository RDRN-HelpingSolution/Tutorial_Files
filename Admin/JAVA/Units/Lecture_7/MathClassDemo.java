package Units.Lecture_7;

public class MathClassDemo {

    public static void main(String[] args) {

        // Constants
        System.out.println("\nValue of PI: " + Math.PI);
        System.out.println("\nValue of E: " + Math.E);

        // Absolute
        System.out.println("\nAbsolute value of -25: " + Math.abs(-25));

        // Max and Min
        System.out.println("\nMaximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("\nMinimum of 10 and 20: " + Math.min(10, 20));

        // Power and Root
        System.out.println("\nSquare root of 64: " + Math.sqrt(64));
        System.out.println("\n2 raised to power 5: " + Math.pow(2, 5));
        System.out.println("\nCube root of 27: " + Math.cbrt(27));

        // Rounding
        System.out.println("\nCeil of 4.3: " + Math.ceil(4.3));
        System.out.println("\nFloor of 4.8: " + Math.floor(4.8));
        System.out.println("\nRound of 4.5: " + Math.round(4.5));

        // Trigonometry
        double angle = 30;
        double radians = Math.toRadians(angle);
        System.out.println("\nSin 30 degrees: " + Math.sin(radians));
        System.out.println("\nCos 30 degrees: " + Math.cos(radians));
        System.out.println("\nTan 30 degrees: " + Math.tan(radians));

        // Logarithmic and Exponential
        System.out.println("\nNatural Log of 10: " + Math.log(10));
        System.out.println("\nLog base 10 of 1000: " + Math.log10(1000));
        System.out.println("\ne raised to 2: " + Math.exp(2));

        // Random Number
        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.println("\nRandom number between 1 and 100: " + randomNum);
        System.out.println();
    }
}

