package princeton.algorithms.partone.week1;

public class QuickUnion {
	/**
	 * QuickUnion algorithm joins the two Nodes on a Network quickly. This
	 * method manages the Connection among the Nodes as a Network of Forests.
	 * Forest - A group of Trees.
	 **/

	int[] nodes = null;

	public QuickUnion(int N) {
		/**
		 * Constructor to initialize a Network with N nodes - starting from 0 to
		 * N - 1
		 **/
		nodes = new int[N];
		for (int i = 0; i < nodes.length; i++)
			nodes[i] = i;

	}

	public void connect(int u, int v) {
		/**
		 * This method checks if two nodes in the Network are connected or not.
		 * If they are not connected then it connects them. - Make the u child
		 * of v.
		 **/

		if (!isConnected(u, v)) {

			int u_root = root(u);
			int v_root = root(v);

			nodes[u_root] = v_root;
		}
	}

	public boolean isConnected(int u, int v) {
		return root(u) == root(v);
	}

	public int root(int n) {
		/**
		 * If this method returns the Root of n in the Network. It checks if the
		 * Node(array index) and its value(array[index]) is same then it has
		 * found the root of the n otherwise it will keep on moving up in the
		 * tree switching index it has found in the value(array[index])
		 **/

		while (nodes[n] != n) {
			n = nodes[n];
		}
		return n;
	}

	public void printNetwork() {
		/** This method will print all the Network Nodes **/
		StringBuilder nodesBuilder = new StringBuilder();
		nodesBuilder.append("\n").append("Network: ");

		for (int i = 0; i < nodes.length; i++) {
			nodesBuilder.append(nodes[i]).append(" ");
		}
		System.out.println(nodesBuilder.toString());
	}

}
