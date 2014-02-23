package princeton.algorithms.partone;

public class QuickSort {

	static int[] a = null;

	public static int partition(int[] ar, int left, int right) {
		a = ar;
		int lo = left;
		int i = left + 1;
		int j = right;

		while (true) {

			while (a[lo] > a[i]) {
				i++;
				if(i == right)
					break;
				
			}

			while (a[lo] < a[j]) {
				j--;
				if(j == left)
					break;
			}

			if (j <= i) {
				swap(a, lo, j);
				break;
			}
			swap(a, i, j);
		}

		return j;
	}

	private static void swap(int[] a, int i, int j) {
		int item = a[i];
		a[i] = a[j];
		a[j] = item;

	}

	public static void sort(int[] arr, int left, int right) {
		if (right <= left)
			return;

		int j = partition(arr, left, right);
		System.out.println("j: " + j);
		sort(arr, left, j - 1);
		sort(arr, j + 1, right);

	}

	public static void printSortedArray() {
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");
	}
}
