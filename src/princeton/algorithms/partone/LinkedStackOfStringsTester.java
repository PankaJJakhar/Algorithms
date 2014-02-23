package princeton.algorithms.partone;

public class LinkedStackOfStringsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		
		stack.printStack();
		stack.push("A");
		stack.push("B");
		System.out.println("Item Popped: " + stack.pop());
		stack.push("C");
		System.out.println("Item Popped: " + stack.pop());
		stack.push("C");
		System.out.println("Item Popped: " + stack.pop());
		stack.push("D");
		System.out.println("Item Popped: " + stack.pop());
		stack.push("E");
		stack.printStack();
	}

}

