package princeton.algorithms.parttwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new GraphTest().startInput();

	}

	private Scanner scanner;

	void startInput() {
		// Takes input from the txt file for
		// inplementing Graph.
		try {
			scanner = new Scanner(new File("tinyG.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int vertices = scanner.nextInt();
		int edges = scanner.nextInt();

		Graph graph = new Graph(vertices);

		for (int i = 0; i < vertices; i++) {
			graph.addEdge(scanner.nextInt(), scanner.nextInt());
		}

		graph.printGraph();

	}

}
