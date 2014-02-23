package princeton.algorithms.parttwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiGraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new DiGraphTest().startInput();

	}

	private Scanner scanner;

	void startInput() {
		// Takes input from the txt file for
		// inplementing Graph.
		try {
			scanner = new Scanner(new File("tinyDiG.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int vertices = scanner.nextInt();
		int edges = scanner.nextInt();

		DiGraph graph = new DiGraph(vertices);

		for (int i = 0; i < edges; i++) {
			graph.addEdge(scanner.nextInt(), scanner.nextInt());
		}

		graph.printGraph();

	}

}
