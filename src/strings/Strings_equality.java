package strings;

import java.util.Scanner;

public class Strings_equality {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		String text1 = in.nextLine();
		String text2 = in.nextLine();

		in.close();

		if (text1 != null && text2 != null) {
			boolean referenceTest = text1 == text2;
			boolean strictEquivalenceTest = text1.equals(text2);
			boolean equivalenceTest = text1.equalsIgnoreCase(text2);

			String message = "text1 length: " + text1.length() + "\n" +
					"text2 length: " + text2.length() + "\n" +
					"text1 == text2: " + referenceTest + "\n" +
					"text1.equals(text2): " + strictEquivalenceTest + "\n" +
					"text1.equalsIgnoreCase(text2): " + equivalenceTest + "\n";

			System.out.println(message);
		}
		/*
		 * Output atteso per text1="ciao" e text2="Ciao":
		 * text1 == text2? False
		 * text1.equals(text2)? False, le due stringhe sono diverse perchè nella seconda stringa la c è maiuscola.
		 * text1.equalsIgnoreCase(text2)? True, se ignoriamo le lettere maiuscole e minuscole le due stringhe sono uguali.
		 *
		 * Output atteso per text1="ciao" e text2="ciao":
		 * text1 == text2? False
		 * text1.equals(text2)? True, le due stringhe sono uguali.
		 * text1.equalsIgnoreCase(text2)? True, le due stringhe sono uguali.
		 */
	}
}