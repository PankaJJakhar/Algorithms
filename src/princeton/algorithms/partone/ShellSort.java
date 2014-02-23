package princeton.algorithms.partone;

public class ShellSort {

	int[] a = null;

	public void sort(int[] a) {
		this.a = a;
		int N = a.length;
		int h = 1;

		while (h < N / 3)
			h = 3 * h + 1;

		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(j, j - h); j -= h) {
					swap(j, j - h);
				}
			}
			h = h / 3;
		}
		
		for(int i = 0; i < a.length; i++)
			
			System.out.println(a[i]);
	}

	private void swap(int j, int i) {
		int num = a[j];
		a[j] = a[i];
		a[i] = num;
		
	}

	private boolean less(int j, int i) {

		if (a[j] < a[i])
			return true;

		return false;
	}
}
