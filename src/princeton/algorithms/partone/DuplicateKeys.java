package princeton.algorithms.partone;

public class DuplicateKeys {

	private static void sort(int[] a, int lo, int hi) {
		
		if(hi <= lo)
			return;
		
		int i = lo + 1;
		int j = hi;
		int lt = lo;
		int gt = j;

		
		
		while (i <= gt) {
			if (a[i] < a[lt]) {
				swap(a, i, lt);
				i++;
				lt++;
			} else if (a[i] > a[lt]) {
				swap(a, i, gt);
				gt--;

			} else if (a[i] == a[lt]) {
				i++;
			}
		}
		sort(a, gt + 1, hi);
		sort(a, lo, lt - 1);
	}

	private static void swap(int[] a, int i, int lt) {
		// swap two numbers in an array
		int num = a[i];
		a[i] = a[lt];
		a[lt] = num;

	}

	public static void sort(int[] a) {

		int hi = a.length - 1;
		int lo = 0;
		
		if(hi <= lo)
			return;
		
		
		sort(a, lo, hi);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}

	

}
