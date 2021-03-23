package arrays;

import java.util.ArrayList;
import java.util.Vector;

// Declaration and usage of different types of structures: array, vector, ArrayList, matrix.

public class array_vector_arrayList {

    public void testArray() {
        int[] array = new int[10]; // All elements are initialized at 0
        System.out.println("Array length: " + array.length);
    }


    public void testMatrix() {
        int[][] matrix = new int[10][10]; // All elements are initialized at 0

        // Print matrix elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("(" + i + "," + j + ") = " + matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }


    public void testVector() {
        Vector<Integer> v = new Vector<Integer>(); // Must use Integer, Double, ecc. Not int, double, ecc.
        // addElement == add, setElementAt == set, removeElementAt == remove, elementAt == get

        v.addElement(5);
        v.addElement(7);
        v.add(3);
        v.add(8);
        System.out.println("Vector dim: " + v.size());

        // Change element at index i with a value of x
        v.setElementAt(10, 0);
		v.set(1, 12);

        // Remove element at index i
        v.remove(1);
		v.removeElementAt(1);

        Integer n = 10; // Same as: Integer n = new Integer(10)

        // Remove the first occurrence of n
        v.remove(n);

        // Print vector
        System.out.print("Vector: ");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(" " + v.elementAt(i));
            // System.out.print(" " + v.get(i));
        }
        System.out.println();
    }


    public void testArrayList() {
        ArrayList<Integer> v = new ArrayList<Integer>(); // Must use Integer, Double, ecc. Not int, double, ecc.
        //Same rules of Vector

        v.add(5);
        v.add(7);
        v.add(3);
        v.add(8);
        v.set(0, 10);
        System.out.println("ArrayList dim: " + v.size());

        v.remove(1);
        Integer n = new Integer(10);
        v.remove(n);

        System.out.print("ArrayList: ");
        for (int i = 0; i < v.size(); i++)
            System.out.print(" " + v.get(i));
        System.out.println();
    }


    public static void main(String[] args) {
        array_vector_arrayList c = new array_vector_arrayList();
        c.testArray();
        System.out.println();
        c.testMatrix();
        System.out.println();
        c.testVector();
        System.out.println();
        c.testArrayList();
    }
}

