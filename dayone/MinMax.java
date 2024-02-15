package dayone;

public class MinMax {
	public static void main(String[] args) {

		int[] numbersArray = { 0, 2, 3, 4, 5, 9, 8, 6, 4, 23, 43, 1 };

		int minElement = findMin(numbersArray);
		int maxElement = findMax(numbersArray);

		System.out.print("Numbers in the Array: ");
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i] + " ");
		}

		System.out.println();
		System.out.println("Min number: " + minElement);
		System.out.println("Max number: " + maxElement);
	}

	// to find min value in the array
	public static int findMin(int[] array) {
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	// to find the max value in the array
	public static int findMax(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}