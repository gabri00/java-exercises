package strings;

import java.util.Scanner;

public class words_in_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Input string: ");
        s = input.next();
        StringBuffer sb = new StringBuffer(s);



        System.out.println();
        input.close();
    }
}
