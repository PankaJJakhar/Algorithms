package com.master.jakhar.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestSumContiguousJUnitTest {

	@Test
	public void test1() {

		System.out.println("Running test case 1 >");

		int expectedOutput = 7;
		int[] input = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
		int actualOutput = LargestSumContiguousSubarray
				.largestContiguousSum(input);
		System.out.println("Largest Contiguous subarray Sum " + actualOutput);

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	public void test2() {

		System.out.println("Running test case 1 >");

		int expectedOutput = 8;
		int[] input = new int[] { -2, -5, 6, -2, -3, 1, 5, -6, 7 };
		int actualOutput = LargestSumContiguousSubarray
				.largestContiguousSum(input);
		System.out.println("Largest Contiguous subarray Sum " + actualOutput);

		assertEquals(expectedOutput, actualOutput);

	}

}
