package princeton.algorithms.partone;

public class SelectionKthTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1711, 5384, 5427, 3599, 2745, 5048, 9622, 6710, 9455, 4924,
				3327, 9405, 2045, 9248, 9848, 1666, 6947, 9966, 3184, 2232};
		int k = SelectionKth.selectKth(a, 19);
		System.out.println("k: " + k);
	}

}
