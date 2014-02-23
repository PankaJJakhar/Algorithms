package princeton.algorithms.partone.week1;

import java.util.ArrayList;

class QuickFind {
	/**
	 * Quick find algorithm is used to find the quick connection between two
	 * nodes on a Network. It quickly tells if two nodes or friends on a network
	 * are connected or not.
	 **/

	int[] nodes = null;

	public QuickFind(int N) {
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
		 * This method connects Nodes u and v if they are not connected. For
		 * making a connection between two Nodes this method simply changes the
		 * values of array from u to v, making them same
		 **/

		if (!isConnected(u, v)) {
			int u_Val = nodes[u];
			int v_Val = nodes[v];

			for (int i = 0; i < nodes.length; i++) {
				if (nodes[i] == u_Val) {
					nodes[i] = v_Val;
				}
			}
		}

	}

	public boolean isConnected(int u, int v) {
		/**
		 * This method checks if two Nodes u and v are connected. if connected
		 * then it returns true, false otherwise
		 **/
		if (nodes[u] == nodes[v])
			return true;

		return false;

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
