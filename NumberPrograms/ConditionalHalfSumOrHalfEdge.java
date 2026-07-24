package numberPrograms;

import java.util.Scanner;

public class ConditionalHalfSumOrHalfEdge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String num = sc.next();

		int length = num.length();

		// Even number of digits
		if (length % 2 == 0) {

			int mid = length / 2;

			String firstHalf = num.substring(0, mid);
			String secondHalf = num.substring(mid);

			int first = Integer.parseInt(firstHalf);
			int second = Integer.parseInt(secondHalf);

			System.out.println("First Half : " + first);
			System.out.println("Second Half: " + second);
			System.out.println("Half Sum = " + (first + second));

		}
		// Odd number of digits
		else {

			int firstDigit = Character.getNumericValue(num.charAt(0));
			int lastDigit = Character.getNumericValue(num.charAt(length - 1));

			System.out.println("First Digit: " + firstDigit);
			System.out.println("Last Digit : " + lastDigit);
			System.out.println("Edge Sum = " + (firstDigit + lastDigit));

		}
	}
}