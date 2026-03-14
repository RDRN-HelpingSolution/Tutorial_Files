package Units.Lecture_7;

class DefaultExample {
    int number = 10;
}

class Student {

    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // ✅ Overriding toString()
    @Override
    public String toString() {
        return "Student{id=" + id +
               ", name='" + name + '\'' +
               ", marks=" + marks + '}';
    }
}

public class toStrignExample {

    public static void main(String[] args) {

        System.out.println("---- 1. Default toString() ----");
        DefaultExample def = new DefaultExample();
        System.out.println(def);  // Implicit call (Object class version)


        System.out.println("\n---- 2. Overridden toString() ----");
        Student s1 = new Student(101, "Rohan", 89.5);
        System.out.println(s1);  // Implicit call (Student version)


        System.out.println("\n---- 3. Explicit Call ----");
        System.out.println(s1.toString());  // Explicit call


        System.out.println("\n---- 4. Implicit Call using println(object) ----");
        System.out.println(s1);  // Automatically calls toString()


        System.out.println("\n---- 5. Implicit Call in Concatenation ----");
        String message = "Student Info: " + s1;  // toString() called internally
        System.out.println(message);
    }
}
