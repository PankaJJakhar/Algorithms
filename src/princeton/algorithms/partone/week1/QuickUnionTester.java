package princeton.algorithms.partone.week1;

public class QuickUnionTester {
	/** Tester class for QuickUnion **/
	public static void main(String args[]) {

		QuickUnion qu = new QuickUnion(10);
		qu.connect(8, 4);
		qu.connect(5, 8);
		qu.connect(9, 2);
		qu.connect(4, 9);
		qu.connect(0, 5);
		qu.connect(3, 2);
		// 8-4 5-8 9-2 4-9 0-5 3-2
		System.out.println(qu.isConnected(9, 1));
		qu.printNetwork();
	}
}
