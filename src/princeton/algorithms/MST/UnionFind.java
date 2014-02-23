package princeton.algorithms.MST;

import java.util.ArrayList;

public class UnionFind {
	/**
	 * This class is implementing the UnionFind algorithm to tell about the
	 * connection of a Node with the Other - if exists or not.
	 **/
	int[] itemsList = null;
	int[] tree = null;

	public UnionFind(ArrayList<Integer> nodes) {

		itemsList = new int[nodes.size()];
		tree = new int[nodes.size()];
		for (int i = 0; i < itemsList.length; i++) {
			itemsList[i] = nodes.get(i);
		}
	}

	public boolean isConnected(int u, int v) {
		/**
		 * This method returns true if u and v are connected , false otherwise.
		 **/

		return false;
	}

	public void union(int u, int v) {
		/** This method connects the v with u. **/

	}

}
