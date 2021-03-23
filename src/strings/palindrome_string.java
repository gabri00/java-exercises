package strings;

import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Input string: ");
        s = input.next();
        StringBuffer sb = new StringBuffer(s);

        if (sb.reverse().toString().equals(s))
            System.out.println(s + " is palindrome");
        else
            System.out.println(s + " isn't palindrome");

        input.close();
    }
}
