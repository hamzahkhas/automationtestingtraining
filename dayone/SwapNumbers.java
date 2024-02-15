package dayone;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();

		System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

		swapNumbers(num1, num2);

		scanner.close();
	}

	public static void swapNumbers(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
	}
}
