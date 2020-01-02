import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// If no arguments from the command line exist...
		if (args.length == 0) {
			// Create a Scanner
			Scanner input = new Scanner(System.in);

			// Prompt the user to enter a string
			System.out.print("Please enter a potential palindrome: ");
			String s = input.nextLine();

			// Display result
			System.out.println("Is \"" + s + "\" a palindrome? " + isPalindrome(s));
		}
		// Use the arguments provided from the command line if they exist
		else {
			// Create a StringBuilder
			StringBuilder stringBuilder = new StringBuilder();
			
			// Add each String argument to the stringBuilder object
			for(String s : args) {
				stringBuilder.append(s);
				stringBuilder.append(" ");
			}
			
			// Convert the stringBuilder back to a String
			String s = stringBuilder.toString();
			
			// Display result
			System.out.println("Is \"" + s + "\" a palindrome? " + isPalindrome(s));
		}
	}

	/** Return true if a string is a palindrome */
	public static boolean isPalindrome(String s) {
		// Create a new string by getting rid of white space
		String s1 = compress(s);

		// Create a new string that is the reversal of s1
		String s2 = reverse(s1);

		// Compare if the reversal is the same as the original string
		return s2.equals(s1);
	}

	/** Create a new string by getting rid of white space */
	public static String compress(String s) {
		// Create a string builder
		StringBuilder stringBuilder = new StringBuilder();

		// Examine each char in the string to skip alphanumeric char
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				stringBuilder.append(s.charAt(i));
			}
		}

		// Return a new filtered string
		return stringBuilder.toString();
	}

	/** Create a new string by reversing the original */
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
}
