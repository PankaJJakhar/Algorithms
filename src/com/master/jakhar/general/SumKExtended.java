package com.master.jakhar.general;

import java.util.ArrayList;
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
public class SumKExtended {

	
	
	public static void main(String[] args) {
		int[] input = new int[] { 4, 4, 6, 6};
		System.out.println("Test case 1 for Sum = 10>>>");
		printOutput(findSum(input, 10));
		System.out.println();
		
		input = new int[] { 5, -2, 3, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 2 for Sum = 3>>>");
		printOutput(findSum(input, 3));
		System.out.println();
		
		input = new int[] { 1, -2, 3, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 3 for Sum = 2>>>");
		printOutput(findSum(input, 2));
		System.out.println();
		
		input = new int[] { 1, -2, 3, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 4 for Sum = 7>>>");
		printOutput(findSum(input, 7));
		System.out.println();
		
		input = new int[] { 2, -2, 2, 8, 7, 6, 4, 10, 1, 9 };
		System.out.println("Test case 5 for Sum = 4>>>");
		printOutput(findSum(input, 4));
		System.out.println();
	}

	/**
	 * Prints the Output for Logging.
	 * @param findSum
	 */
	private static void printOutput(ArrayList<Index> indicesList) {
		int size = indicesList.size();
		for(int i = 0; i < size; i++)
		{
			Index index = indicesList.get(i);
			System.out.printf("Combination #%d>>>>>\n", i + 1);
			System.out.println(index.secondElement);
			System.out.println(index.firstElement);
		}
		
	}

	/**
	 * Stores the indices of items found in the array.
	 * @author JAKHAR
	 *
	 */
	public static class Index{
		int firstElement;
		int secondElement;
		
		public Index(int first, int second)
		{
			firstElement = first;
			secondElement = second;
		}
	}
	
	/**
	 * Finds the two numbers in the array which has sum = k.
	 * 
	 * @param input
	 * @param i
	 */
	public static ArrayList<Index> findSum(int[] input, int sum) {

		/**List to store Index instances.*/
		ArrayList<Index> indicesList = new ArrayList<Index>();
		
		/** Optimal Lookup table. */
		HashMap<Integer, ArrayList<Integer>> valueToIndices = new HashMap<Integer, ArrayList<Integer>>();

				int size = input.length;
		for (int i = 0; i < size; i++) {
			int currentValue = input[i];
			/**
			 * If (sum - currentValue) already exists in the lookup table then
			 * it ensures that currentValue + (sum - currentValue) = sum which
			 * is what is the desired result.
			 */
			if (valueToIndices.containsKey(sum - currentValue)) {
				int currentIndex = i;
				ArrayList<Integer> indices = valueToIndices.get(sum - currentValue);
				
				int storedIndicesSize = indices.size();
				for(int indexCount = 0; indexCount < storedIndicesSize; indexCount++)
				{
					Index index = new Index(currentIndex, indices.get(indexCount));
					indicesList.add(index);
				}
			}
			
			/**Stores current Index if duplicate or new one.*/
			if(valueToIndices.containsKey(currentValue))
			{
				ArrayList<Integer> inddexList = valueToIndices.get(currentValue);
				inddexList.add(i);
				valueToIndices.put(currentValue, inddexList);
			}
			else
			{
				ArrayList<Integer> inddexList = new ArrayList<Integer>();
				inddexList.add(i);
				valueToIndices.put(currentValue, inddexList);
			}
			
		}
		return indicesList;
	}

}
