package strings;

import java.util.Scanner;

// 'A' = 65
// 'a' = 97

public class toUpperCase_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Input string: ");
        s = input.next();
        StringBuffer sb = new StringBuffer(s);

        for (int i=0; i<sb.length(); i++) {
            char c = sb.charAt(i);
            if ((c >= 'a') && (c <= 'z')) {
                int lower_c_code = (int)c - 32;
                // Replace in sb lower case with upper case
                char upper_c = (char)lower_c_code;
                sb.setCharAt(i, upper_c);
            }
        }

        System.out.println("Upper case string: " + sb);
        input.close();
    }
}
