package files;

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

// Print on a file N random doubles. Random numbers are in [10, 30)

public class output_to_file_random_numbers {
    public static void main(String[] args) throws Exception {

        FileWriter output = new FileWriter("src/files/output.txt");
        PrintWriter write = new PrintWriter(output);

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers to generate? ");
        final int N = in.nextInt();

        Random rnd = new Random();
        for (int i = 1; i <= N; i++) {
            write.printf("%.2f", (10 + rnd.nextDouble() * 20));
            write.println();
        }

        in.close();
        write.close();
        output.close();
    }
}
