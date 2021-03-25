package files;

import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

// Read a vector from file where the first number is the size of the vector

public class read_num_from_file {
    public static void main(String[] args) throws Exception {
        FileReader inputFile = new FileReader("src/files/input.txt");

        Scanner in = new Scanner(inputFile);

        final int N = in.nextInt();

        Vector<Double> records = new Vector<>();
        for (int i = 1; i <= N; i++)
            records.add(in.nextDouble());

        for (int i = 0; i < N; i++) System.out.format("%.2f ", records.get(i));

        in.close();
        inputFile.close();
    }
}