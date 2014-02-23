package princeton.algorithms.partone;

public class MergeSort {

	
	public static void sort(int[] a, int[] aux, int lo, int hi)
	{
		if(hi <= lo)
			return;
		int mid = lo + (hi - lo)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {

		int i = lo;
		int j = mid + 1;
		for(int k = 0; k <= hi; k++)
		{
			if(i > mid) a[k] = aux[j++];
			else if(j > hi) a[k] = aux[i++];
			else if(a[i] > a[j]) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
	}
	
	public static void sort(int[] a)
	{
		int aux[] = new int[a.length];
		for(int i = 0; i < a.length; i++)
			aux[i] = a[i];
		sort(a, aux, 0, a.length);
		System.out.println(aux);
	}
}
 