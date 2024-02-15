package dayone;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		int result = factorial(number);

		System.out.println("Factorial of " + number + " is " + result);
	}

	public static int factorial(int number) {

		if (number == 0 || number == 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
}