package princeton.algorithms.parttwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;

class BreadthFirstSearch {
	/** This class implements Depth First Search **/
	int[] m_Vertices = null;
	int[] m_EdgeTo = null;
	boolean[] m_Marked = null;
	Graph graph = null;
	Queue<Integer> queue = null;

	public BreadthFirstSearch(Graph graph, int src) {
		/**
		 * DepthFirstSearch constructor.
		 * 
		 */
		int numOfVertices = graph.m_Vertices.size();
		m_Vertices = new int[numOfVertices];
		m_EdgeTo = new int[numOfVertices];
		m_Marked = new boolean[numOfVertices];
		queue = new Queue<Integer>() {
			ArrayList<Integer> queueList = new ArrayList<>();

			@Override
			public boolean addAll(Collection<? extends Integer> arg0) {
				return false;
			}

			@Override
			public void clear() {
				queueList.clear();
			}

			@Override
			public boolean contains(Object arg0) {
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> arg0) {
				return false;
			}

			@Override
			public boolean isEmpty() {
				if (queueList.size() == 0)
					return true;

				return false;
			}

			@Override
			public Iterator<Integer> iterator() {
				return null;
			}

			@Override
			public boolean remove(Object arg0) {
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> arg0) {
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> arg0) {
				return false;
			}

			@Override
			public int size() {
				return queueList.size();
			}

			@Override
			public Object[] toArray() {
				return null;
			}

			@Override
			public <T> T[] toArray(T[] arg0) {
				return null;
			}

			@Override
			public boolean add(Integer val) {
				queueList.add(val);
				return false;
			}

			@Override
			public Integer element() {
				return null;
			}

			@Override
			public boolean offer(Integer arg0) {
				return false;
			}

			@Override
			public Integer peek() {
				return null;
			}

			@Override
			public Integer poll() {
				return null;
			}

			@Override
			public Integer remove() {
				return queueList.remove(0);
			}
		};
		this.graph = graph;

		// Mark src vertex as already visited.
		// m_Marked[src] = true;
		queue.add(src);
		this.m_Marked[0] = true;
		visitGraph();

		tracePath();
	}

	private void tracePath() {
		// TODO: Left

	}

	private void visitGraph() {
		/**
		 * This method visits the Graph.
		 * **/
		// Find all adj vertices to src.

		if (queue.size() == 0)
			return;

		int node = queue.remove();

		System.out.println("Visiting " + node);

		ArrayList<Integer> adjList = (ArrayList<Integer>) graph.getAdj(node);
		Collections.reverse(adjList);

		for (int i = 0; i < adjList.size(); i++) {
			int adj = adjList.get(i);

			if (!m_Marked[adj]) {

				queue.add(adj);
				m_EdgeTo[adj] = node;
				m_Marked[adj] = true;
			}
		}

		visitGraph();
		// }
		// visitGraph(node);

	}

}
