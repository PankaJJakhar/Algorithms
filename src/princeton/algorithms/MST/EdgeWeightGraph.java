package princeton.algorithms.MST;

import java.util.ArrayList;
import java.util.Collection;

public class EdgeWeightGraph {
	/** This is the API for edge weighted graph. **/
	ArrayList<ArrayList<Edge>> m_Vertices = null;

	public EdgeWeightGraph(int v) {
		/** Constructor initializes the empty graph with v number of vertices. **/
		m_Vertices = new ArrayList<ArrayList<Edge>>();
		for(int i = 0; i < v; i++)
		{
			m_Vertices.add(new ArrayList<Edge>());
		}
	}

	public void addEdge(Edge edge) {
		/** Method to add edges in the Graph **/
		int v = edge.either();
		int w = edge.other(v);

		// Weighted Graph is not a directed graph.
		m_Vertices.get(v).add(edge);
		m_Vertices.get(w).add(edge);

	}

	public Iterable<Edge> adj(int v) {
		/** This method returns the adjacent Edges of Edge v. **/
		return m_Vertices.get(v);
	}

	public ArrayList<Edge> getAllEdges()
	{/**This method returns all the Edges in the tree**/
		
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		for(int i = 0 ; i < m_Vertices.size(); i++)
		{
			edgeList.addAll((Collection<? extends Edge>) adj(i));
		}
		return edgeList;
	}
	
	
	public void printGraph() {
		/** This method will traverse the graph. **/

		for (int i = 0; i < m_Vertices.size(); i++) {

			System.out.println("Vertex - " + i + ": "
					+ getEdgeTemplate(m_Vertices.get(i)));
		}
	}

	private String getEdgeTemplate(ArrayList<Edge> edgeList) {
		/** This method formats the edges in [v, w, weight] format **/
		StringBuilder edgeBuilder = new StringBuilder();
		for (int i = 0; i < edgeList.size(); i++) {
			Edge edge = edgeList.get(i);
			edgeBuilder.append("[").append(edge.either()).append(", ")
					.append(edge.other(edge.either())).append(", ")
					.append(edge.weight()).append("]");
		}
		return edgeBuilder.toString();
	}
}
