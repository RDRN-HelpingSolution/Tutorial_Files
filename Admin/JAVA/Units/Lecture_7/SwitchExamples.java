package Units.Lecture_7;
// File: SwitchExamples.java

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

public class SwitchExamples {
    public static void main(String[] args) {
        System.out.println("1 SIMPLE SWITCH STATEMENT (int)");
        simpleSwitch();

        System.out.println("\n2 SWITCH EXPRESSION USING ARROW SYNTAX (int)");
        switchExpressionArrow();

        System.out.println("\n3 SWITCH EXPRESSION WITH YIELD (int)");
        switchExpressionYield();

        System.out.println("\n4 SIMPLE SWITCH WITH ENUM");
        enumSwitch();

        System.out.println("\n5 SWITCH EXPRESSION WITH ENUM");
        enumSwitchExpression();
    }

    // 1️⃣ Simple switch using int
    public static void simpleSwitch() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    // 2️⃣ Switch expression with arrow syntax
    public static void switchExpressionArrow() {
        int day = 3;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };
        System.out.println("Day name: " + result);
    }

    // 3️⃣ Switch expression with yield
    public static void switchExpressionYield() {
        int marks = 95;
        String grade = switch (marks / 10) {
            case 10, 9 -> "A+";
            case 8 -> {
                System.out.println("Calculating...");
                yield "A";
            }
            case 7 -> "B";
            default -> "F";
        };
        System.out.println("Grade: " + grade);
    }

    // 4️⃣ Enum with simple switch
    public static void enumSwitch() {
        Day today = Day.TUESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case TUESDAY:
                System.out.println("Second day");
                break;
            case WEDNESDAY:
                System.out.println("Mid-week");
                break;
            default:
                System.out.println("Unknown day");
        }
    }

    // 5️⃣ Enum with switch expression
    public static void enumSwitchExpression() {
        TaskStatus status = TaskStatus.IN_PROGRESS;
        String message = switch (status) {
            case NEW -> "Task created";
            case IN_PROGRESS -> "Task in progress";
            case COMPLETED -> "Task done";
        };
        System.out.println("Status: " + message);
    }
}

// import java.util.Scanner;

// public class Switch_statement {
//     public static void main(String[] args) {
//         System.out.println("DAY Finder");
//         Scanner s=new Scanner(System.in);
//         System.out.println();
//         System.out.print("Provide number for Week : ");
//         int day=s.nextInt();

//         System.out.println();
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
        
//             default: System.out.println("invalid");
               
//         }

//         switch (day) {
            
//         }
//     }
// }
