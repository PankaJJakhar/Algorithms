package com.master.jakhar.general;

/**
 * Class to test {@link ContagiousSum}.
 * 
 * @author JAKHAR
 *
 */
public class ContagiousSumTester {

	public static void main(String[] args) {
		System.out.println("Test case 1");
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ContagiousSum.findSum(input, 9);
		System.out.println();
		
		System.out.println("Test case 2");
		input = new int[] { 1, 5, 4, 3, 4, 5, 6, 7, 8, 9 };
		ContagiousSum.findSum(input, 11);
		System.out.println();
		
		System.out.println("Test case 3");
		input = new int[] { 9, 5, 4, 3, 4, 5, 6, 7, 8, 9 };
		ContagiousSum.findSum(input, 8);
		System.out.println();
		
		System.out.println("Test case 4");
		input = new int[] { 8, 1, 4, 3 };
		ContagiousSum.findSum(input, 6);
		System.out.println();
	}

}
