package queue;

import org.junit.Test;

public class TestQueue {

	@Test
	public void queueTest(){
		QueueUsingArray<Integer> queue = new QueueUsingArray<>();
		queue.enqueue(100);
		queue.enqueue(5);
		queue.enqueue(7);
		queue.dequeue(); // 5 7
		queue.enqueue(3);
		queue.enqueue(1);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.dequeue(); // 7 3 1 9 10 4 6
		queue.enqueue(2);
		queue.traverse(); // 7 3 1 9 10 4 6 2
	}
}
