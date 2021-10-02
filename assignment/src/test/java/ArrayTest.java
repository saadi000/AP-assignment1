import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayTest {

	
	private Array obj;
	@Test
	public void test() {
		
		obj=new Array();
		
		
		obj.insert(7, 0);
		obj.insert(12, 1);
	    obj.insert(4, 2);
	    obj.insert(7, 3);
	    obj.insert(8,4);
	    assertEquals(true,obj.linearSearch(4));
		
	}
	@Test
	public void testbinary() {
		obj=new Array();
		
		
		obj.insert(7, 0);
		obj.insert(12, 1);
	    obj.insert(4, 2);
	    obj.insert(7, 3);
	    obj.insert(8,4);
	    assertEquals(true,obj.binarySearch(4,0,4));
	}
	@Test
	public void delete() {
		obj=new Array();
		obj.insert(7, 0);
		obj.insert(12, 1);
	    obj.insert(4, 2);
	    obj.insert(7, 3);
	    obj.insert(8,4);
		obj.delete(2);
		
		assertEquals(7,obj.array[2]);
		
	}
	
	@Test
	public void sort() {
		obj=new Array();
		obj.insert(7, 0);
		obj.insert(12, 1);
	    obj.insert(4, 2);
	    obj.insert(7, 3);
	    obj.insert(8,4);
	    obj.bubbleSort();
	    int expected[] = {4,7,7,8,12};
	    assertEquals(expected[4],obj.array[4]);
	}
	@Test(expected =java.lang.ArrayIndexOutOfBoundsException.class)
	public void insert() {
		int []arr=new int[5];
		
		ArrayInsertion obj=new ArrayInsertion();
		int j=1;
		for(int i=0;i<5;i++,j++) {
		obj.insert(arr, j, i);
		
		}	
	}
	@Test(expected =java.lang.ArrayIndexOutOfBoundsException.class)
	public void insertError() {
		int arr[]=new int[1];
		Array obj=new Array();
		obj.insert(50, -1);
		
		}	
}
