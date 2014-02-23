package princeton.algorithms.partone;


public class QueueOfStrings {

	Node last;
	Node first;

	private class Node {
		String item;
		Node next;
		Node previous;
	}

	public void enqueue(String item) {
				
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.previous = oldLast;

	}

	public String dequeue() {

		
		String item = first.item;
		first = first.next;
		return item;
	}

	public void printQueue() {
		if (first == null)
			System.out.println("Queue Empty");
		else {

			Node iteratorNode = new Node();
			iteratorNode.item = first.item;
			iteratorNode.next = first.next;

			while (iteratorNode.next != null) {
				String item = iteratorNode.item;
				System.out.println("Node -> " + item);
			}
			System.out.println("Node -> " + iteratorNode.item);

		}
	}
}
