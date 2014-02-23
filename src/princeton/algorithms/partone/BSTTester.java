package princeton.algorithms.partone;

public class BSTTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bst = new BST();
		bst.insert(1, 10);
		bst.insert(2, 20);
		bst.insert(3, 30);
		bst.insert(4, 40);
		bst.insert(5, 50);
		bst.insert(6, 60);
		bst.insert(7, 70);
		bst.delete(2);
		System.out.println("Get: " + bst.get(7));
		System.out.println("Get: " + bst.get(2));
		System.out.println("Get: " + bst.get(7));
	}

}
