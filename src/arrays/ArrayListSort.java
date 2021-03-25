package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSort {

    public static void main(String[] args) {
        // Declare Scanner obj
        Scanner in = new Scanner(System.in);

        // Read N
        System.out.print("Input N: ");
        int N = in.nextInt();

        // Declare ArrayList of size N
        // Integer is a wrapper class for int data type,
        // because ArrayList requires a class, not a type
        ArrayList<Integer> v = new ArrayList<>(N);

        // Input array values
        for (int i = 0; i < N; i++) {
            System.out.print("Input " + i + "-th value: ");
            v.add(in.nextInt());
        }

        // Print (unordered) array
        System.out.print("Unordered array: ");
        for (int i = 0; i < N; i++) System.out.print(v.get(i) + " ");
        System.out.println();

        // Sort array
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (v.get(i) > v.get(j)) {
                    int temp = v.get(i);
                    v.set(i, v.get(j));
                    v.set(j, temp);
                }
            }
        }

        // Print (ordered) array
        System.out.print("Ordered array: ");
        for (int i = 0; i < N; i++) System.out.print(v.get(i) + " ");
        System.out.println();

        // Free mem
        in.close();
    }

}
