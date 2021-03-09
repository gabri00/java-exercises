package arrays;

import java.util.Scanner;

public class array2DSum {

    public static void main(String[] args) {
        // Declare Scanner obj
        Scanner in = new Scanner(System.in);

        // Read number of rows and columns
        System.out.print("Input number of rows: ");
        int rows = in.nextInt();
        System.out.print("Input number of columns: ");
        int cols = in.nextInt();

        // Declare matrix m of size rows x cols
        int[][] m = new int[rows][cols];

        // Input matrix values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Input value at [" + (i+1) + ", " + (j+1) + "]: ");
                m[i][j] = in.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        // Compute the sum of rows and columns
        int[] sum_rows = new int[rows];
        int[] sum_cols = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum_rows[i] += m[i][j];
                sum_cols[j] += m[i][j];
            }
        }

        // Print sum of rows and columns
        System.out.print("Sum of rows: ");
        for (int i = 0; i < rows; i++) System.out.print(sum_rows[i] + " ");
        System.out.println();
        System.out.print("Sum of columns: ");
        for (int j = 0; j < cols; j++) System.out.print(sum_cols[j] + " ");

        // Free mem
        in.close();
    }

}
