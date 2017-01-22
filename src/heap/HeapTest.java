package heap;

import org.junit.Test;

public class HeapTest {

	
	@Test
	public void Test(){
		HeapImplementation<Integer> heap = new HeapImplementation();
		heap.insert(1);
		heap.insert(10);
		heap.insert(5);
		heap.insert(3);
		heap.insert(6);
		heap.delete();
		
		System.out.println(heap);
		
	}
}
