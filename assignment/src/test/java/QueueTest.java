import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void enque_test() {
		Queue queue=new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		assertNotNull(queue.array);
	}
	@Test
	public void deque_test() {
		Queue queue=new Queue(3);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		int expected=queue.dequeue();
		assertEquals(10,expected);
	}
	@Test
	public void deque_test2() {
		Queue queue=new Queue(3);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		int expected=-1;
		assertEquals(-1,expected);
	}
	@Test
	public void LL_enque_test() {
		Queue_linklist queue=new Queue_linklist();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		assertNotNull(queue.head);
	}
	@Test
	public void LL_deque_test() {
		Queue_linklist queue=new Queue_linklist();
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		int expected=queue.dequeue();
		assertEquals(30,expected);
	}
	@Test
	public void LL_deque_test2() {
		Queue_linklist queue=new Queue_linklist();
		queue.enqueue(80);
		queue.enqueue(90);
		queue.enqueue(100);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		int expected=-1;
		assertEquals(-1,expected);
	}
}
