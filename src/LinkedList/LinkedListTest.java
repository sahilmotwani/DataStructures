package LinkedList;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void Test(){
		MyLinkedList<Integer> list = new MyLinkedList();
		list.add(2);
		list.add(15);
		list.add(10);
		
		System.out.println(list.find(2));
		System.out.println(list.find(15));
		System.out.println(list.find(10));
		list.delete(15);
		System.out.println(list.find(15));
	}
}
