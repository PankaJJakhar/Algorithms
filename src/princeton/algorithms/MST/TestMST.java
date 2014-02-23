package princeton.algorithms.MST;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMST {

	public static void main(String[] args) {
		TestMST test = new TestMST();
		test.startReadingGraph();

	}

	private void startReadingGraph() {
		/** This method reads the Graph from a text file. **/

		Scanner scan = null;
		try {
			scan = new Scanner(new File("10000EWG.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int vertices = scan.nextInt();
		int edges = scan.nextInt();

		// InitializeGraph.
		EdgeWeightGraph graph = new EdgeWeightGraph(vertices);

		for (int i = 0; i < edges; i++) {
			graph.addEdge(new Edge(scan.nextInt(), scan.nextInt(), scan
					.nextDouble()));
		}
		
		//graph.printGraph();
		MST mst = new MST(graph);
		
	}

}
