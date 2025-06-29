package Units.Lecture_6.static_keyword;

//  Static Import
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class StaticKeywordDemo {





    //  1. Static Variable Example
    static class CollegeInfo {
        static String collegeName = "ABC University";  // Static Variable
        int studentId;
        String studentName;

        CollegeInfo(int id, String name) {
            studentId = id;
            studentName = name;
        }

        void showInfo() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("College Name (static): " + collegeName);
        }
    }









    //  2. Static Method Example
    static class MathUtility {
        static int cube(int x) {
            return x * x * x;
        }
    }






    //  3. Static Block Example
    static class AppConfig {
        static String environment;
        
        static {
            environment = "Production";
            System.out.println("\nStatic Block Output:");
            System.out.println("Environment set to: " + environment);
        }
    }









    //  4. Static Nested Class Example
    static class OuterClass {
        static int outerData = 50;

        static class NestedStaticClass {
            void printData() {
                System.out.println("\nStatic Nested Class Output:");
                System.out.println("Accessed static data from outer class: " + outerData);
            }
        }
    }










    //  Main method to demonstrate all static types
    public static void main(String[] args) {
        System.out.println("========= Static Variable Output =========");
        CollegeInfo s1 = new CollegeInfo(101, "Ravi");
        CollegeInfo s2 = new CollegeInfo(102, "Priya");
        s1.showInfo();
        System.out.println("-----------------------------------------");
        s2.showInfo();








        System.out.println("\n========= Static Method Output =========");
        int result = MathUtility.cube(3);
        System.out.println("Cube of 3 using static method: " + result);








        // Static Block already executed during AppConfig class loading








        System.out.println("\n========= Static Nested Class Output =========");
        OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
        nested.printData();






        
        System.out.println("\n========= Static Import Output =========");
        System.out.println("Using PI directly: " + PI);
        System.out.println("Square root of 49 directly: " + sqrt(49));
    }
}

