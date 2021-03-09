package arrays;

import java.util.Scanner;

public class arraySort {

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

        // Print (unordered) array
        System.out.print("Unordered array: ");
        for (int i = 0; i < N; i++) System.out.print(v[i] + " ");
        System.out.println();

        // Sort array
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        // Print (ordered) array
        System.out.print("Ordered array: ");
        for (int i = 0; i < N; i++) System.out.print(v[i] + " ");
        System.out.println();

        // Free mem
        in.close();
    }

}
