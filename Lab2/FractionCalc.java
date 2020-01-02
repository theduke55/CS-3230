import java.util.Scanner;
import java.util.StringTokenizer;

public class FractionCalc {

	static String regex = "-?[0-9]+[ \t]*/[ \t]*-?[0-9]+[ \t]*[+-/\\*][ \t]*-?[0-9]+[ \t]*/[ \t]*-?[0-9]+";

	public static void main(String[] args) {
//		String[] tests = { "20 / 30 * 10 / 40", "20/30*10/40", "-20/30*10/40", "-20/30*10/-40", "-1/2-1/2", "-1/2--1/2",
//				"1/2\t/\t3/-4", "    1/2/3/-4", "1/2/3/-4    ", " 1 + 1 / 2", "1 / 2 + 1", " 1 + 1", "1 / 2 / 3" };
		boolean isValid = true;
		
		Fraction left = new Fraction(1);
		Fraction right = new Fraction(1);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		

		do {
			// Prompt user for input
			System.out.println("Please enter a fraction expression: ");
			
			// Collect the input and remove white space
			String expression = input.nextLine();
			expression = expression.replaceAll("\\s","");

			// Check for a valid entry
			if (expression.matches(regex)) {
				
				// Create StringTokenizer for numerical values
				StringTokenizer numbers = new StringTokenizer(expression, "-+*/");
				int numCounter = 1;
				while (numbers.hasMoreTokens()) {
					if(numCounter == 1) {
						left.numerator = Integer.parseInt(numbers.nextToken());
						numCounter++;
					}
					else if(numCounter == 2) {
						left.denominator = Integer.parseInt(numbers.nextToken());
						numCounter++;
					}
					else if(numCounter == 3) {
						right.numerator = Integer.parseInt(numbers.nextToken());
						numCounter++;
					}
					else if(numCounter == 4) {
						right.denominator = Integer.parseInt(numbers.nextToken());
						numCounter++;
					}
				}
				System.out.println(left);
				System.out.println(right);
				
				/** I couldn't figure out how to separate the negative
				 * sign from the subtract token. This problem resulted
				 * in being unable to use any of the Fraction methods
				 */
//				StringTokenizer symbols = new StringTokenizer(expression, "0123456789");
//				int symCount = 1;
//				while (symbols.hasMoreTokens()) {
//					System.out.println(symbols.nextToken());
//					if((symbols.nextToken().equals("-") && symCount == 1)) {
//						System.out.println("it worked");
//						symCount++;
//					}
//				}
			} else {
				System.out.println(expression + " :is NOT a valid expression.");
				isValid = false;
				break;
			}
			System.out.println();
		} while (isValid);
	}
}
