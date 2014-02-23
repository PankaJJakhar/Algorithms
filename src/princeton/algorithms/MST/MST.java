package princeton.algorithms.MST;

import java.util.ArrayList;

public class MST {
	/**
	 * This class holds the logic for Minimum Spanning Tree Implementation. This
	 * class implements the Kruskal's MST algorithm.
	 **/
	// EdgeWeightGraph graph = null;

	public MST(EdgeWeightGraph graph) {
		// this.graph = graph;

		calculateMST(graph);
	}

	private void calculateMST(EdgeWeightGraph graph) {
		/** This method creates MST from the given EdgeWeightedGraph. **/

		long startTime = System.currentTimeMillis();
		// Start solving the problem.
		
		
		EdgeSet edgeSet = new EdgeSet(graph.getAllEdges());
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.printf("Time in milliseconds: %d", timeTaken);
		
//		ArrayList<Edge> edgeList = getSortedListOfEdges(graph.m_Vertices);
//		
//		ArrayList<Edge> mst = new ArrayList<>();
//		while(edgeList.size() != 0 || mst.size() != graph.m_Vertices.size())
//		{
//			
//		}
		
	}

	private ArrayList<Edge> getSortedListOfEdges(ArrayList<ArrayList<Edge>> m_Vertices) {
		/** This method will return the sorted list of Edges **/

		return null;
	}

}
