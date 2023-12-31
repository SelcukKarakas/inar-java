package week_06.assignments;

import java.util.Scanner;

public class Question_06_17 {


    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter n
        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Display an n-by-n matrix
        printMatrix(n);
    }

    /**
     * Method printMatrix displays an n-by-n matrix
     */
    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                // Generate and print randomly 0 or 1
                System.out.print((int) (Math.random() * 2));
            }
            // Print newline
            System.out.println();
        }
    }

}
