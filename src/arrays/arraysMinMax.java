package arrays;

import java.util.Scanner;

public class arraysMinMax {

    public static void main(String[] args) {
        // Declare Scanner obj
        Scanner in = new Scanner(System.in);

        // Read N
        System.out.print("Input N: ");
        int N = in.nextInt();

        // Declare array v[N]
        int[] v = new int[N];

        // Input array values
        for (int i = 0; i < N; i++) {
            System.out.print("Input " + i + "-th value: ");
            v[i] = in.nextInt();
        }

        // Print array
        for (int i = 0; i < N; i++) System.out.print(v[i] + " ");
        System.out.println();

        // Get the maximum of the array
        int max = v[0];
        for (int i = 0; i < N; i++) if (v[i] > max) max = v[i];
        System.out.println("Max: " + max);

        // Get the minimum of the array
        int min = v[0];
        for (int i = 0; i < N; i++) if (v[i] < min) min = v[i];
        System.out.println("Min: " + min);

        // Free mem
        in.close();
    }

}
