package princeton.algorithms.parttwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class DepthFirstSearch {
	/** This class implements Depth First Search **/
	int[] m_Vertices = null;
	int[] m_EdgeTo = null;
	boolean[] m_Marked = null;
	Graph graph = null;

	public DepthFirstSearch(Graph graph, int src) {
		/**
		 * DepthFirstSearch constructor.
		 * 
		 */
		int numOfVertices = graph.m_Vertices.size();
		m_Vertices = new int[numOfVertices];
		m_EdgeTo = new int[numOfVertices];
		m_Marked = new boolean[numOfVertices];
		this.graph = graph;

		// Mark src vertex as already visited.
		// m_Marked[src] = true;
		visitGraph(src);
		tracePath();
	}

	private void visitGraph(int src) {
		/**
		 * This method visits the Graph.
		 * **/
		// System.out.println("Visiting " + src);
		// Find all adj vertices to src.
		m_Marked[src] = true;

		ArrayList<Integer> adjList = (ArrayList<Integer>) graph.getAdj(src);
		Collections.reverse(adjList);
		// If all adj vertices are visited then return back.

		for (int i = 0; i < adjList.size(); i++) {
			int vertex = adjList.get(i);

			if (!m_Marked[vertex]) {
				visitGraph(vertex);
				m_EdgeTo[vertex] = src;
			}
		}

	}

	public void tracePath() {
		/** This method returns the path that was traversed to visit Vertices **/
		int[] a = m_EdgeTo;
	}

	public Iterable<Integer> getPathTo(int v) {
		/** This method returns the path to vertex v **/
		if (!m_Marked[v])
			return null;
		Stack<Integer> path = new Stack<Integer>();

		path.push(v);
		int i = v;
		while (i != 0) {
			int cameFrom = m_EdgeTo[i];
			path.push(cameFrom);
			i = cameFrom;
		}
		return path;
	}

	public void printPathTo(int v) {
		/** This method prints the path to vertex v **/
		if (!m_Marked[v]) {
			System.out.println("No path to vertex: " + v);
			return;
		}

		Stack<Integer> path = new Stack<Integer>();

		path.push(v);
		int i = v;
		while (i != 0) {
			int cameFrom = m_EdgeTo[i];
			path.push(cameFrom);
			i = cameFrom;
		}

		for (int p = 0; p < path.size() - 1; p++) {
			System.out.print(path.get(p) + "->");
		}

		System.out.println(0);
	}

}
