package com.master.jakhar.general;

/**
 * Tests {@link LargestSumContiguousSubarray} class.
 * @author JAKHAR
 *
 */
public class LargestSumContiguousSubarrayTester {

	public static void main(String[] args) {
		/**Test 1*/
		int[] input = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Running test case 1 >");
		System.out.println("Largest Contiguous subarray Sum " + LargestSumContiguousSubarray.largestContiguousSum(input));
		
		 /**Test 2*/
		input = new int[] {-2, -5, 6, -2, -3, 1, 5, -6, 7};
		System.out.println("Running test case 2 >");
		System.out.println("Largest Contiguous subarray Sum " + LargestSumContiguousSubarray.largestContiguousSum(input));
		
	}

}
