package princeton.algorithms.partone;


public class BinaryHeap {
//This class is for BInaryHeap structure to hold data.
	private static int[] a = null;
	private static int N = 1;
	
	public BinaryHeap()
	{
		a = new int[2];
	}
	
	
	public static void insert(int num)
	{//This method will insert a num in the binary heap.
		resetHeapSize();
		a[N] = num;
		swim(N);
		N++;
	}


	private static void resetHeapSize() {
		// This method will automatically increase 
		//and decrease heap size as per the requirement.
		if(a.length == N)
		{
			int temp[] = new int[N];
			for(int i = 0; i < a.length; i++)
			{
				temp[i] = a[i];
			}
			a = new int[2*N];
			
			for(int i = 0; i < temp.length; i++)
			{
				a[i] = temp[i];
			}
		}
		else if(a.length == N/2)
		{
			int temp[] = new int[N/2];
			for(int i = 0; i < a.length; i++)
			{
				temp[i] = a[i];
			}
			a = new int[N/2];
			
			for(int i = 0; i < temp.length; i++)
			{
				a[i] = temp[i];
			}
		}
	
		
	}


	private static void swim(int n) {
		// This method will swim element at position n
		//to its perfect position in Binary Heap.
		while(n > 1 && a[n/2] < a[n])
		{
			swap(n, n/2);
			n = n/2;
		}
		
	}
	
	private static void sink(int k)
	{//This method will sink an item at position k
		//to its exact position in the Binary Heap.
		while(2*k <= N)
		{
			int j = 2*k;
			
			if(j < N && a[j] < a[j + 1]) j++;
			if(a[k] > a[j]) break;
			swap(k, j);
			k = j;
		}
		
	}

	public static int delMax()
	{//This method will remove and return the maximum number from the 
		//Binary Heap.
		int max = a[1];
		N--;
		swap(1, N--);
		sink(1);
		N++;
		
		//remove loitering
		//a[N + 1] = null;
		System.out.println("Max Deleted: " + max);
		return max;
		
	}
	
	
	private static void swap(int n, int i) {
		// This method will swap two numbers in array a.
		int temp = a[n];
		a[n] = a[i];
		a[i] = temp;
	}
	
	public static void printHeap()
	{//This method will print contents of Binary Heap.
		for(int i = 0; i < N; i++)
		{
			System.out.println(a[i] + " ");
		}
		
	}
	
}
