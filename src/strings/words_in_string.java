package strings;

import java.util.Scanner;
import java.util.Vector;

public class words_in_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = input.nextLine().trim();

        String[] words = s.split(" ");
        for (String word : words) System.out.println("[" + word + "]");

        input.close();
    }
}
