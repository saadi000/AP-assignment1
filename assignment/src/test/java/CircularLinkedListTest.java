import static org.junit.Assert.*;

import org.junit.Test;

public class CircularLinkedListTest {

	@Test
	public void test() {
		CircularLinkedList list;
		list=new CircularLinkedList();
		assertNull(list.head);
		
	}
	@Test
	public void push_test() {
		CircularLinkedList list;
		list=new CircularLinkedList();
		list.pushFront(10);
		assertNotNull(list.head);
	}
	@Test
	public void pop_test() {
		CircularLinkedList list;
		list=new CircularLinkedList();
		list.pushFront(10);
		list.pushFront(20);
		list.popFront();
		assertNotNull(list.head);
	}
	@Test
	public void pop_test2() {
		CircularLinkedList list;
		list=new CircularLinkedList();
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		list.popFront();
		assertNotNull(list.head.next);
	}
	@Test
	public void equalheadtest() {
		CircularLinkedList list;
		list=new CircularLinkedList();
		CircularLinkedList list2;
		list2=new CircularLinkedList();
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		list2.pushFront(10);
		list2.pushFront(20);
		list2.pushFront(30);
		assertSame(list.head,list2.head);
	}
	@Test
	public void notequaltest() {
		CircularLinkedList list;
		list=new CircularLinkedList();
		CircularLinkedList list2;
		list2=new CircularLinkedList();
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		list2.pushFront(10);
		list2.pushFront(20);
		list2.pushFront(30);
		assertNotSame(list.head,list2.head.next);
	}
	@Test
	public void popequaltest() {
		CircularLinkedList list;
		list=new CircularLinkedList();
		CircularLinkedList list2;
		list2=new CircularLinkedList();
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		list2.pushFront(10);
		list2.pushFront(20);
		list2.pushFront(30);
		list2.popBack();
		assertSame(list.head,list2.head);
	}
	@Test
	public void swaptest() {
		LinkedList l1;
		l1=new LinkedList();
		l1.pushFront(30);
		l1.pushBack(40);
		l1.pushBack(60);
		LinkedList l2;
		l2=new LinkedList();
		l2.pushFront(60);
		l2.pushBack(40);
		l2.pushBack(30);
		l2.swap();
		assertSame(l1.head,l2.head);
		assertSame(l1.head.next,l2.head.next);
	}
}
