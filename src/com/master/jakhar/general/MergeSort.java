package com.master.jakhar.general;

public class MergeSort {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 3, 5 };
		int[] array2 = new int[] { 2, 4, 6, 8, 9 };
		merge(array1, array2);
	}

	/**
	 * This algorithm takes two sorted Arrays of Integer type and returns the
	 * final sorted array after merging those two sorted arrays. Requires extra
	 * memory because it is not in place algorithm.
	 * 
	 * @param array1
	 *            first array.
	 * @param array2
	 *            second array.
	 * @return sorted array after merging two arrays that were passed to it.
	 */
	public static int[] merge(int[] array1, int[] array2) {
		int i = 0;
		int j = 0;
		int k = 0;

		int[] output = new int[array1.length + array2.length];

		/** Merge two arrays in one sorted array. */
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j])
				output[k++] = (array1[i++]);
			else
				output[k++] = (array2[j++]);
		}

		/** Copy remaining elements from array1 to output array. */
		if (i < array1.length) {
			for (int l = i; l < array1.length; l++) {
				output[k] = array1[l];
			}
		}

		/** Copy remaining elements from array2 to output array. */
		if (j < array2.length) {
			for (int l = j; l < array2.length; l++) {
				output[k++] = array2[l];
			}
		}

		/** Print the output array. */
		for (int l = 0; l < output.length; l++) {
			System.out.println(output[l]);
		}

		/** Return the output array. */
		return output;
	}

}