package Units.Lecture_6.Constructor;

//  1. Default Constructor Example
class Car {
    String brand;

    // Default Constructor - no parameters
    Car() {
        brand = "Tata";
        System.out.println(" Default Constructor Called (Car)");
    }

    void show() {
        System.out.println("Brand: " + brand);
    }
}









//  2. Parameterized Constructor Example
class Student {
    String name;
    int age;

    // Parameterized Constructor - takes arguments
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(" Parameterized Constructor Called (Student)");
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}










//  3. Constructor Overloading Example
class Book {
    String title;
    int pages;

    // Constructor 1 - Default
    Book() {
        title = "Unknown";
        pages = 0;
        System.out.println(" Default Constructor Called (Book)");
    }

    // Constructor 2 - One Parameter
    Book(String title) {
        this.title = title;
        this.pages = 100;
        System.out.println(" Parameterized Constructor Called (Book - 1 param)");
    }

    // Constructor 3 - Two Parameters
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        System.out.println(" Parameterized Constructor Called (Book - 2 params)");
    }

    void show() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}













//  4. Constructor Chaining Example
class Bike {
    String brand;
    int speed;

    // Default Constructor calls parameterized one using this()
    Bike() {
        this("Hero", 60); // Constructor Chaining
        System.out.println(" Default Constructor Called (Bike - with this())");
    }

    // Parameterized Constructor
    Bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println(" Parameterized Constructor Called (Bike)");
    }

    void show() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}











//  Main class to run all constructors
public class Constructor_Example {
    public static void main(String[] args) {

        System.out.println("\n========== Default Constructor ==========");
        Car car1 = new Car();
        car1.show();





        System.out.println("\n========== Parameterized Constructor ==========");
        Student s1 = new Student("Roushan", 21);
        s1.show();








        System.out.println("\n========== Constructor Overloading ==========");
        Book b1 = new Book(); // Calls default
        b1.show();
        Book b2 = new Book("Java Basics"); // One param
        b2.show();
        Book b3 = new Book("Advanced Java", 300); // Two params
        b3.show();









        
        System.out.println("\n========== Constructor Chaining ==========");
        Bike bike1 = new Bike(); // Calls default, which calls parameterized
        bike1.show();
    }
}
