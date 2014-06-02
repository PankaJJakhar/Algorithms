package com.master.jakhar.general;

/**
 * Finds the sum of Contagious elements in an array which should be equal to the
 * goal.
 * 
 * @author JAKHAR
 *
 */
public class ContagiousSum {

	/**
	 * This algorithm finds the contagious numbers with sum = goal in very
	 * optimal way.
	 * 
	 * If keeps two pointers to keep track of the contagious elements in the
	 * array. And according to the sum of those contagious elements it increases
	 * pointers i and j. If the total sum of contagious numbers is less than the
	 * goal then it increases the pointer j which again adds one more element in
	 * the total sum. If at some point the total sum of contagious numbers is
	 * greater than the goal then delete i pointer element from the contagious
	 * segment and increment the i pointer by 1.
	 * 
	 * @param input
	 *            Array in which contagious elements with the sum = goal are to
	 *            be found.
	 * @param goal
	 *            sum of the contagious elements should be equal to the goal.
	 */
	public static void findSum(int[] input, int goal) {
		int i = 0;
		int j = 0;
		int sum = 0;
		boolean isSumFound = false;
		while (sum > goal && j == input.length || j < input.length
				|| sum == goal) {
			if (sum < goal)
				sum += input[j++];
			else if (sum > goal)
				sum -= input[i++];

			else {
				isSumFound = true;
				printSum(input, i, j, sum);
				break;
			}
		}

		if (!isSumFound)
			System.out.printf("Contagious numbers with sum %d are not found!",
					goal);
	}

	/**
	 * Prints the Numbers that make the sum equal to goal.
	 * 
	 * @param input
	 *            input array in which contagious sum was to be found.
	 * @param start
	 *            Number of item from which contagious sequence starts.
	 * @param end
	 *            Number of item from which contagious sequence ends.
	 * @param sum
	 *            Sum of contagious numbers.
	 */
	public static void printSum(int[] input, int start, int end, int sum) {
		System.out.printf("Sum: %d\n", sum);
		System.out.printf("Contagious numbers started at %d and ended at %d\n",
				start + 1, end);
		System.out.println("Numbers are >>>");
		for (int i = start; i < end; i++) {
			System.out.println(input[i]);
		}
	}
}