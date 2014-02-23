package princeton.algorithms.partone;

public class LinkedStackOfStrings {

	private Node first = null;

	private class Node {
		String item;
		Node next;
	}

	public void push(String item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}

	public String pop() {
		String item = first.item;
		first = first.next;
		return item;

	}

	Node printer = null;

	public void printStack() {
		if (first != null) {

			printer = new Node();
			printer.item = first.item;
			printer.next = first.next;

			while (printer.next != null) {
				String item = printer.item;
				System.out.println("Node -> " + item);
				printer = printer.next;
			}
			System.out.println("Node -> " + printer.item);
		} else {
			System.out.println("Stack empty");
		}
	}

}
