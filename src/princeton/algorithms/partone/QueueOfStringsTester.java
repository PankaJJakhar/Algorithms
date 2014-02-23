package princeton.algorithms.partone;

public class QueueOfStringsTester {

	public static void main(String[] args)
	{
		QueueOfStrings queue = new QueueOfStrings();
		queue.printQueue();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.dequeue();
		System.out.println("Queue after push operation");
		queue.printQueue();
		queue.enqueue("D");
		queue.enqueue("E");
		queue.dequeue();
		System.out.println("Queue after push operation");
		queue.printQueue();	
		
	}
}

