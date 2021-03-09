package arrays;

import java.util.Scanner;

public class array2DBias {

    public static void main(String[] args) {
        // Declare Scanner obj
        Scanner in = new Scanner(System.in);

        // Read number of rows and columns
        System.out.print("Input number of rows and columns (square matrix): ");
        int N = in.nextInt();

        // Declare matrix m of size rows x cols
        int[][] m = new int[N][N];

        // Input matrix values
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Input value at [" + (i+1) + ", " + (j+1) + "]: ");
                m[i][j] = in.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }

        // Compute the multiplication of the main and secondary diagonal
        int bias = 1;
        for (int i = 0; i < N; i++) bias *= m[i][i];
        System.out.println("Main bias: " + bias);
        bias = 1;
        for (int i = 0; i < N; i++) bias *= m[i][N-i-1];
        System.out.println("Secondary bias: " + bias);

        // Free mem
        in.close();
    }

}
