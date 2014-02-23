package princeton.algorithms.partone;

public class SelectionKth {

	public static int partition(int a[], int lo, int hi) {// THis method will
															// help in
		// partitioning an array
		// i will scan from left to
		// right
		// j will scan from right to
		// left
		int i = lo + 1;
		int j = hi;

		while (true) {
			while (a[i] <= a[lo]) {
				i++;
				if (i == hi)
					break;
			}

			while (a[j] >= a[lo]) {
				j--;
				if (j == lo)
					break;
			}

			if (j <= i)
				break;

			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;
	}

	private static void swap(int[] a, int i, int j) {
		// swap two numbers.
		int num = a[i];
		a[i] = a[j];
		a[j] = num;

	}

	public static int selectKth(int[] a, int k) {
		int lo = 0;
		int hi = a.length - 1;

		while (hi > lo) {
			int j = partition(a, lo, hi);
			if (j < k)
				lo = j + 1;
			else if (j > k)
				hi = j - 1;
			else
				return a[k];
		}
		return a[k];
	}
}
