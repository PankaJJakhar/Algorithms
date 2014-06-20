package com.master.jakhar.general;

/**
 * Uses Kadane’s Algorithm to find the Largest Sum of Contiguous Subarray.
 * @author JAKHAR
 *
 */
public class LargestSumContiguousSubarray {
	
	/**
	 * Finds the largest sum so far.
	 * @param input
	 * @return
	 */
	static int largestContiguousSum(int[] input) {
		
		int largest = 0;
		int sumSoFar = 0;
		
		for(int i = 0; i < input.length; i++)
		{
			sumSoFar = sumSoFar + input[i];
			
			if(sumSoFar < 0)
				sumSoFar = 0;
			
			if(sumSoFar > largest)
				largest = sumSoFar;
		}
	
		return largest;

	}

}
