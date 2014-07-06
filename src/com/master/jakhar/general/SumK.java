package com.master.jakhar.general;

import java.util.HashMap;

/**
 * This class finds the two elements in an Integer array which sums equal to
 * some Integer value Sum. Sum = value of addition of two numbers.
 * 
 * It has linear O(n) time complexity. As you only need to iterate over the
 * array to find those two elements which has sum equal to the number Sum passed
 * to it. The lookup hash table reduces the complexity of this algorithm to
 * linear O(n).
 * 
 * @author JAKHAR
 *
 */
public class SumK {

	public static void main(String[] args) {
		int[] input = new int[] { 5, 2, 3, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 1 for Sum = 10>>>");
		findSum(input, 10);
		System.out.println();
		
		input = new int[] { 5, -2, 3, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 2 for Sum = 3>>>");
		findSum(input, 3);
		System.out.println();
		
		input = new int[] { 1, -2, 3, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 3 for Sum = 2>>>");
		findSum(input, 2);
		System.out.println();
		
		input = new int[] { 1, -2, 3, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 4 for Sum = 7>>>");
		findSum(input, 7);
		System.out.println();
	}

	/**
	 * Finds the two numbers in the array which has sum = k.
	 * 
	 * @param input
	 * @param i
	 */
	public static void findSum(int[] input, int sum) {

		/** Optimal Lookup table. */
		HashMap<Integer, Boolean> intToBoolean = new HashMap<Integer, Boolean>();

		/** Initialize numbers. -1 shows no match found yet. */
		int firstElement = -1;
		int secondElement = -1;

		int size = input.length;
		for (int i = 0; i < size; i++) {
			int currentValue = input[i];
			/**
			 * If (sum - currentValue) already exists in the lookup table then
			 * it ensures that currentValue + (sum - currentValue) = sum which
			 * is what is the desired result.
			 */
			if (intToBoolean.containsKey(sum - currentValue)) {
				firstElement = sum - currentValue;
				secondElement = currentValue;
				break;
			}
			intToBoolean.put(currentValue, true);
		}
		System.out.printf("First Element: %d\n", firstElement);
		System.out.printf("Second Element: %d", secondElement);
	}

}
