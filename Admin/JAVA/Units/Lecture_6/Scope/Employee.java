package Units.Lecture_6.Scope;

public class Employee {

    // 🔸 Static (Class) Variable
    // Shared by ALL employees (all objects of the class)
    static String companyName = "TechNova Solutions"; // 🔁 Scope: Entire class

    // 🔸 Instance Variables
    // Each employee object has their OWN name and salary
    String employeeName;  // 🔁 Scope: whole object
    double salary;

    // 🔹 Constructor to set instance variables
    public Employee(String name, double sal) {
        employeeName = name;
        salary = sal;
    }

    // 🔹 Method to show details
    public void showDetails() {
        // 🔸 Local Variable
        // Exists ONLY inside this method
        double bonus = salary * 0.10; // 💡 10% bonus // 🔁 Scope: Only inside this method

        System.out.println("Company: " + companyName);          // Using static variable
        System.out.println("Employee Name: " + employeeName);   // Using instance variable
        System.out.println("Salary: " + salary);
        System.out.println("Bonus (10%): " + bonus);

        // 🔸 Block Variable
        // Declared inside a for-loop block
        for (int year = 1; year <= 3; year++) {
            // year is a block variable // 🔁 Scope: Only inside this loop
            System.out.println("Year " + year + ": Performance Reviewed");
        }

        // System.out.println(year); // ❌ ERROR: year is not visible here (block variable)
    }





    
    // 🔹 Main Method
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee("Roushan", 50000);
        Employee emp2 = new Employee("Aman", 60000);

        // Showing details for both employees
        System.out.println("------ Employee 1 Details ------");
        emp1.showDetails();

        System.out.println("\n------ Employee 2 Details ------");
        emp2.showDetails();
    }
}



// 🧠 Simple Analogy:

// Imagine a company:

// The company name is the same for all employees → static

// Each employee has their own name and salary → instance

// During performance calculation, the bonus is used temporarily → local

// Inside a review loop, the year number is used → block