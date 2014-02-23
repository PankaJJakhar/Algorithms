package princeton.algorithms.parttwo;

import java.awt.List;
import java.util.ArrayList;

public class Graph {
	/**
	 * This class holds the API for implementing Graph.
	 */
	ArrayList<ArrayList<Integer>> m_Vertices = null;

	public Graph(int v) {
		/**
		 * Graph Constructor will initialize the Graph with v number of
		 * Vertices.
		 **/
		m_Vertices = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < v; i++)
			m_Vertices.add(new ArrayList<Integer>());

	}

	public int numEdges() {
		/** Return the no. of edges in the Graph. **/
		int numEdges = 0;
		for (int i = 0; i < m_Vertices.size(); i++) {
			numEdges += m_Vertices.get(i).size();
		}
		return numEdges;
	}

	public int numVertices() {
		/** Returns the number of vertices in the Graph. **/
		return m_Vertices.size();
	}

	public void addEdge(int v, int w) {
		/**
		 * Adds edge v to w to the Graph. Add two way edges in case of Graph.
		 **/
		m_Vertices.get(v).add(w);
		m_Vertices.get(w).add(v);
	}

	public Iterable<Integer> getAdj(int v) {
		/** This method returns the Adjacency list of **/
		return m_Vertices.get(v);
	}

	public int getDegree(int v) {
		/** Tell the degree of the Node passed to it **/
		return m_Vertices.get(v).size();

	}

	public int getNumberOfSelfLoops(int v) {
		/** Tell the degree of the Node passed to it **/
		int selfLoops = 0;
		for (int i = 0; i < m_Vertices.size(); i++) {
			ArrayList<Integer> adjList = m_Vertices.get(i);

			for (int j = 0; j < adjList.size(); j++) {
				if (i == adjList.get(j)) {
					selfLoops++;
				}
			}
		}
		return selfLoops;
	}

	public int maxDegree() {
		/** Returns the maximum degree of the Graph **/
		int maxDegree = 0;
		int degree = 0;

		for (int i = 0; i < m_Vertices.size(); i++) {
			degree = m_Vertices.get(i).size();
			if (degree > maxDegree)
				maxDegree = degree;
		}

		return maxDegree;
	}

	public double avgDegree() {
		/** Returns the avg degree of the Graph. **/
		return 2.0 * numEdges() / numVertices();
	}

	public void printGraph() {
		/** Prints the Graph **/
		for (int i = 0; i < m_Vertices.size(); i++) {
			ArrayList<Integer> adjList = m_Vertices.get(i);
			for (int j = 0; j < adjList.size(); j++) {
				System.out.println(i + " -> " + adjList.get(j));
			}
		}
	}
}
