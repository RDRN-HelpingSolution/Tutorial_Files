package Units.Lecture_5;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // 🔹 1. Declaration + Allocation
        int[] numbers = new int[5];
        String[] names = new String[5];

        System.out.println("Enter 5 integers:");

        // 🔹 2. Taking int input from user
        int i = 0;
        while (i < numbers.length) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        }

        System.out.println("\nEnter 5 names:");

        // 🔹 3. Taking String input from user
        i = 0; // reset counter
        scanner.nextLine(); // clear input buffer
        while (i < names.length) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            i++;
        }

        // 🔹 4. Display array length
        System.out.println("\nLength of numbers array: " + numbers.length);
        System.out.println("Length of names array: " + names.length);

        // 🔹 5. Modify an element in both arrays
        numbers[2] = 999;         // change third number
        names[1] = "UpdatedName"; // change second name

        // 🔹 6. Display all array elements
        System.out.println("\nModified Numbers:");
        i = 0;
        while (i < numbers.length) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
            i++;
        }

        System.out.println("\nModified Names:");
        i = 0;
        while (i < names.length) {
            System.out.println("names[" + i + "] = " + names[i]);
            i++;
        }

        // 🔹 7. Search in integer array
        System.out.print("\nEnter number to search: ");
        int numToSearch = scanner.nextInt();
        i = 0;
        boolean foundNum = false;

        while (i < numbers.length) {
            if (numbers[i] == numToSearch) {
                foundNum = true;
                break;
            }
            i++;
        }

        if (foundNum) {
            System.out.println("Number found in array.");
        } else {
            System.out.println("Number not found in array.");
        }

        // 🔹 8. Search in string array
        scanner.nextLine(); // clear buffer
        System.out.print("\nEnter name to search: ");
        String nameToSearch = scanner.nextLine();
        i = 0;
        boolean foundName = false;

        while (i < names.length) {
            if (names[i].equalsIgnoreCase(nameToSearch)) {
                foundName = true;
                break;
            }
            i++;
        }

        if (foundName) {
            System.out.println("Name found in array.");
        } else {
            System.out.println("Name not found in array.");
        }

        scanner.close(); // Close scanner
    }




        // int []marks={2,45,56,33,25,22,3,1,23,4,45};
        // System.out.print("Provide a number : ");
        // Scanner s=new Scanner(System.in);
        // int num=s.nextInt();
        // s.close();
        // int x=0;
        // while (x<marks.length) {
        //     if (num==marks[x]) {
        //         System.out.println("Found"); 
        //     }
        //     x++;
        // }



        // System.out.println(marks[2]);
        // marks[2]=45;
        // System.out.println();
        // System.out.println(marks[2]);
        // System.out.println(marks[9]);
        // System.out.println();
        // System.out.println("Length "+marks.length);
        // int rdrn=8;
        // System.out.println(marks[rdrn]);
        // System.out.println("..................");

        // int num=0;
        // while (num<marks.length) {
        //     System.out.println(marks[num]);
        //     num++;
        // }
        // System.out.println("************");
        
    }

