package Units.Lecture_6.Class_Object_use;

// Class definition
public class Car {
    // Public instance variables (attributes)
    public String brand;
    public String color;
    public int fuelLevel;

    // Public method to display car info
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Fuel Level: " + fuelLevel);
    }

    // Public method to simulate driving
    public void drive() {
        System.out.println("Driving the car...");
        fuelLevel -= 10; // reduce fuel
        System.out.println("Fuel after driving: " + fuelLevel);
    }


// Main class to create and use objects

    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car(); // Object creation

        // Assigning values to object's variables
        myCar.brand = "Honda";
        myCar.color = "Red";
        myCar.fuelLevel = 100;

        // Calling object's methods
        myCar.showDetails();
        myCar.drive();
    }
}
