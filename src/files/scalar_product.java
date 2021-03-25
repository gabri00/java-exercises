package files;

import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

/*
 Read two integer vectors from 2 different files. 0 is the ending of the array
 Verify that they have the same length
 Calculate the scalar product
 Print everything
*/

public class scalar_product {
    public static void main(String[] args) throws Exception {
        FileReader v1_file = new FileReader("src/files/vector1.txt");
        FileReader v2_file = new FileReader("src/files/vector2.txt");

        Scanner in_v1 = new Scanner(v1_file);
        Scanner in_v2 = new Scanner(v2_file);

        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();

        while (true) {
            int x = in_v1.nextInt();
            if (x == 0) break;
            v1.add(x);
        }

        in_v1.close();

        while (true) {
            int x = in_v2.nextInt();
            if (x == 0) break;
            v2.add(x);
        }

        in_v2.close();

        System.out.println("v1 size: " + v1.size());
        System.out.println("v2 size: " + v2.size());

        if (v1.size() != v2.size()) {
            System.out.println("Vectors must be of the same length!");
            System.exit(1);
        }

        int sc_prod = 0;
        for (int i = 0; i < v1.size(); i++)
            sc_prod += v1.get(i) * v2.get(i);

        for (int el : v1) System.out.print(el + " ");
        System.out.println();
        for (int el : v2) System.out.print(el + " ");
        System.out.println();

        System.out.println("Scalar Product: " + sc_prod);

        v1_file.close();
        v2_file.close();
    }
}
