package Units.Lecture_5;

import java.util.Scanner;

public class multi_D_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Declaration + Allocation
        int[][] nums = new int[2][3];  // 2 rows, 3 columns

        // 2. Showing array length
        System.out.println("Number of rows: " + nums.length);
        System.out.println("Number of columns: " + nums[0].length);

        // 3. Input elements using while loop
        int i = 0;
        while (i < nums.length) {
            int j = 0;
            while (j < nums[i].length) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                nums[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        // 4. Modify one element (example)
        nums[0][0] = 99;

        // 5. Print all elements
        System.out.println("Array elements:");
        i = 0;
        while (i < nums.length) {
            int j = 0;
            while (j < nums[i].length) {
                System.out.print(nums[i][j] + "\t");
                j++;
            }
            System.out.println();
            i++;
        }

        // 6. Search element
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        boolean found = false;

        i = 0;
        while (i < nums.length) {
            int j = 0;
            while (j < nums[i].length) {
                if (nums[i][j] == key) {
                    found = true;
                }
                j++;
            }
            i++;
        }

        // 7. Output result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }

        
        // int[][] rf={{1,2,3,6},{4,5,6},{7,8,9,4,5}};
        // rf[0][2]=3;
        // System.out.println(rf[0][2]);
        // int i=0;
        // while (i<rf.length) {
        //     int j=0;
        //     while (j<rf[i].length) {
        //         System.out.print(rf[i][j]);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;

        // }

    }

