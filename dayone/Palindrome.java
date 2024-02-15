package dayone;

public class Palindrome {
	public static void main(String[] args) {
		String input = "racecar";

		boolean result = checkPalindrome(input);

		if (result) {
			System.out.println("The string \'" + input + "\' is a palindrome");
		} else {
			System.out.println("The string \'" + input + "\' is not a palindrome");
		}
	}

	public static boolean checkPalindrome(String str) {

		// convert to lowercase
		String convString = str.replaceAll("^a-zA-Z0-9", "").toLowerCase();

		// check if string is palindrome
		int left = 0;
		int right = convString.length() - 1;

		while (left < right) {
			if (convString.charAt(left) != convString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}