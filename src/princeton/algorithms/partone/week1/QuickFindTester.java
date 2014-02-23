package princeton.algorithms.partone.week1;

public class QuickFindTester {
	/** Tester class for QuickFind **/
	public static void main(String args[]) {

		QuickFind qf = new QuickFind(10);
		qf.connect(8,  4);
		qf.connect(5,  8);
		qf.connect(9,  2);
		qf.connect(4,  9);
		qf.connect(0,  5);
		qf.connect(3,  2);
		//8-4 5-8 9-2 4-9 0-5 3-2 
		System.out.println(qf.isConnected(9, 1));
		qf.printNetwork();
	}

}
