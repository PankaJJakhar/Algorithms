package princeton.algorithms.partone.week1;

public class WeightedQuickUnion {
	/**
	 * This algorithm is the improvement over QuickUnion algorithm. It avoids
	 * the creation of lengthy Tree which causes the performance issues. This
	 * algorithm helps to fix this problem by managing weight of the tree on the
	 * basis of Height of Tree.
	 **/

	int[] nodes = null;
	int[] nodesWeight = null;

	public WeightedQuickUnion(int N) {
		/**
		 * Constructor to initialize a Network with N nodes - starting from 0 to
		 * N - 1. It also has an extra arry to hold the weight of Each
		 * Node(Because each Node can work as the Parent to other Nodes in the
		 * Network)
		 **/
		nodes = new int[N];
		nodesWeight = new int[N];

		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = i;
			nodesWeight[i] = 0;
		}

	}

	public void connect(int u, int v) {
		/**
		 * This method checks if two nodes in the Network are connected or not.
		 * If they are not connected then it connects them. - Make the u child
		 * of v if the weight of v is greater than u else it makes v the child
		 * of u.
		 **/

		if (!isConnected(u, v)) {

			int u_root = root(u);
			int v_root = root(v);

			if (nodesWeight[u_root] < nodes[v_root]) {
				nodesWeight[u_root] += nodesWeight[v_root];
				nodes[u_root] = v_root;

			} else {
				nodesWeight[v_root] += nodesWeight[u_root];
				nodes[v_root] = u_root;

			}
		}
		printNetwork();
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
