package princeton.algorithms.MST;

import java.util.ArrayList;

public class EdgeSet {
	/** This class will remove duplicates from a list. **/

	private ArrayList<Edge> edgeList = null;
	ArrayList<Edge> filteredList = null;

	private Node root = null;

	public EdgeSet(ArrayList<Edge> edgeList) {
		this.edgeList = edgeList;
		filteredList = new ArrayList<Edge>();
		removeDuplicates();
		printUniqueNodes();
	}

	private void removeDuplicates() {
		/** This method will start the process of duplicate removal. **/
		for (int i = 0; i < edgeList.size(); i++) {
			Edge edge = edgeList.get(i);
			addToTree(edge);
		}

	}

	private void addToTree(Edge edge) {
		/** This method will add the Edge only if it does not exist in the tree. **/
		Node node = new Node(edge);

		if (root == null) {// Adding root node to the tree.
			root = node;
			filteredList.add(node.edge);
		} else {
			Node tempRoot = root;
			while (true) {
				if (node.edge.weight() < tempRoot.edge.weight()) {
					/** In case weight of the encountered edge is less. **/
					if (tempRoot.left == null) {
						tempRoot.left = node;
						filteredList.add(node.edge);
						break;
					} else {
						tempRoot = tempRoot.left;
					}
				} else if (node.edge.weight() > tempRoot.edge.weight()) {
					/** In case weight of the encountered edge is greater. **/
					if (tempRoot.right == null) {
						tempRoot.right = node;
						filteredList.add(node.edge);
						break;
					} else {
						tempRoot = tempRoot.right;
					}
				} else if (node.edge.weight() == tempRoot.edge.weight()) {
					/** In case weight of the encountered edge is equal. **/

					int vNode = node.edge.either();
					int wNode = node.edge.other(vNode);

					int v_tempRoot = tempRoot.edge.either();
					int w_tempRoot = tempRoot.edge.other(v_tempRoot);

					if ((vNode == v_tempRoot && wNode == w_tempRoot)
							|| (vNode == w_tempRoot && wNode == v_tempRoot))

					{
						break;
					} else {

						boolean isFound = false;
						for (int m = 0; m < tempRoot.equals.size(); m++) {
							Edge e = tempRoot.equals.get(m).edge;
							int ve = e.either();
							int we = e.other(ve);
							if ((vNode == ve && wNode == we)
									|| (vNode == we && wNode == ve)) {
								isFound = true;
								break;
							}

						}

						if (!isFound) {
							tempRoot.equals.add(node);
							filteredList.add(node.edge);
						}
						break;
					}
				}
			}
		}
	}

	class Node {// Node of a Tree
		public Edge edge = null;
		public Node left = null;
		public Node right = null;
		public ArrayList<Node> equals = new ArrayList<Node>();

		public Node(Edge e) {
			edge = e;
		}
	}

	private void printUniqueNodes() {
		for (int i = 0; i < filteredList.size(); i++) {
			Edge e = filteredList.get(i);
			// System.out.println(e.either() + "->" + e.other(e.either()) + ": "
			// + e.weight());
		}
		System.out.println("Total Nodes: " + filteredList.size());
	}

}
