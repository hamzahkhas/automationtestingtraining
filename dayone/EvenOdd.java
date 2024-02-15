package dayone;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("---Check if number is even or odd---");
		System.out.print("Enter number : ");
		int number = sc.nextInt();

		String result = checkEvenOdd(number);

		System.out.println(result);

		sc.close();
	}

	public static String checkEvenOdd(int num) {
		// if remainder is 0, num is even. otherwise odd
		if (num % 2 == 0) {
			return "Number " + num + " is even";
		} else {
			return "Number " + num + " is odd";
		}
	}
}