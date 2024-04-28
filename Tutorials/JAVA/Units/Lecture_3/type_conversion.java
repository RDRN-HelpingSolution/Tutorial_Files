package Units.Lecture_3;

public class type_conversion {
    public static void main(String[] args) {
        // Implicit
        double r=100.98;
        System.out.println(r);
        System.out.println();
  
        // Explicit

        // A.Primitive Type Casting
        double rd = 3.14;
        int ri = (int) rd;
        System.out.println(ri);
        System.out.println();

        // B.Reference Type Casting
        Object ro = "Hello";
        String rs = (String) ro;
        System.out.println(rs);
    }
}
