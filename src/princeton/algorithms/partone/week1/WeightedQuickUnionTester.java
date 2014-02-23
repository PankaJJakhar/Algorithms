package princeton.algorithms.partone.week1;

public class WeightedQuickUnionTester {

	public static void main(String[] args) {
		WeightedQuickUnion wqu = new WeightedQuickUnion(10);

		//4-0 7-6 5-9 1-2 8-2 0-7 1-5 6-8 4-3
		wqu.connect(4, 0);
		wqu.connect(7, 6);
		wqu.connect(5, 9);
		wqu.connect(1, 2);
		wqu.connect(8, 2);
		wqu.connect(0, 7);
		wqu.connect(1, 5);
		wqu.connect(6, 8);
		wqu.connect(4, 3);
		wqu.printNetwork();
	}

}
