import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	
	@Test
	public void pushtest() {
		Stack obj=new Stack();
		obj.push(50);
		assertNotNull(Stack.array);
	}
	@Test
	public void pushfulltest() {
		Stack obj=new Stack();
		int j=0;
		for(int i=0;i<101;i++,j++)
		obj.push(j);
		assertNotNull(Stack.array);
	}
	@Test
	public void poptest() {
		Stack obj=new Stack();
		obj.push(50);
		obj.push(20);
		int i=obj.pop();
		int expect=20;
		assertEquals(expect,i);
	}
	@Test
	public void popnulltest(){
		Stack obj=new Stack();
		obj.push(50);
		obj.push(20);
		int i=obj.pop();
		int j=obj.pop();
		int k=obj.pop();
		int expect=-1;
		assertEquals(expect,k);
	}
	@Test
	public void pushnulltestLL() {
		StackLinkList obj=new StackLinkList();
		assertNull(obj.head);
	}
	@Test
	public void pushtestLL() {
		StackLinkList obj=new StackLinkList();
		obj.push(50);
		assertNotNull(obj.head);
	}
	@Test
	public void poptestLL() {
		StackLinkList obj=new StackLinkList();
		obj.push(50);
		obj.push(60);
		obj.push(70);
		int i=obj.pop();
		int expect=70;
		assertEquals(expect,i);
	}
	@Test
	public void poptest2LL() {
		StackLinkList obj=new StackLinkList();
		obj.push(50);
		obj.push(60);
		obj.push(70);
		int i=obj.pop();
		int j=obj.pop();
		int k=obj.pop();
		int l=obj.pop();
		int expect=-1;
		assertEquals(expect,l);
	}
	
}
