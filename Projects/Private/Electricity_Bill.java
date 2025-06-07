import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Electricity_Bill {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");

        try {
            // Input start date
            System.out.print("Enter the start date (dd-MM-yyyy): ");
            //String startInput = scanner.nextLine();

            
                                                      CharSequence startInput="06-06-25";

                                                      
            LocalDate startDate = LocalDate.parse(startInput, formatter);
            System.out.println();

            // Input end date
            System.out.print("Enter the end date (dd-MM-yyyy): ");
            String endInput = scanner.nextLine();
            LocalDate endDate = LocalDate.parse(endInput, formatter);
            System.out.println();

            // Calculate the number of days
            long numberOfDays = Math.abs(ChronoUnit.DAYS.between(startDate, endDate));
            System.out.println("Number of days = " + numberOfDays);
            System.out.println();

            // Step 1: x = 1 / 30.5
            double x = 1.0 / 30.5;

            // Step 2: y = x * 200
            double y = x * 200;

            // Step 3: z = y * numberOfDays
            double z = y * numberOfDays;

            // Input last reading
            System.out.print("Enter the last reading value: ");
            //double lastReading = scanner.nextDouble();
            System.out.println();


                                                                double lastReading=80658;



            // Step 4: a = z + lastReading
            double a = z + lastReading;

            // Display final result
            System.out.println("Final result for Free Electricity is = " + a);

        } catch (Exception e) {
            System.out.println("Invalid input! Please follow the input format correctly.");
        } finally {
            scanner.close();
        }
    }
}
