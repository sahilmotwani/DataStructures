package heap;

import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;

public class HeapImplementation<T extends Comparable<T>> {

	ArrayList<T> items;

	public HeapImplementation(){
		items=new ArrayList<T>();
	}
	
	public void insert(T item){
		items.add(item);
		siftUp();
	}
	
	public T delete() throws NoSuchElementException{
		int size = items.size();
		if(size==0){
			throw new NoSuchElementException();
		}
		if(size==1){
			items.remove(0);
		}
		T remItem = items.get(0);
		items.set(0, items.remove((size-1)));
		siftDown();
		return remItem;
	}

	private void siftUp(){
		int k= items.size()- 1;

		while(k>0){
			int p = (k-1)/2;
			T item = items.get(k);
			T parent = items.get(p);

			if(item.compareTo(parent)>0){
				items.set(k, parent);
				items.set(p, item);
				k=p;
			}
			else{
				break;
			}
		}
	}

	private void siftDown(){
		int k = 0;
		int left =  2*k+1;
		while(left<items.size()){
			int max=left; int right=left+1;
			if(right<items.size()){
				if(items.get(right).compareTo(items.get(left))>0){
					max++;
				}
			}
			if(items.get(k).compareTo(items.get(max))<0){
				T temp = items.get(k);
				items.set(k, items.get(max));
				items.set(max, temp);
				k=max;
				left = 2*k+1;
			}else{
				break;
			}
		}
	}
	
	public boolean isEmpty(){
		return items.isEmpty();
	}
	
	public int size(){
		return items.size();
	}
	
	public String toString(){
		return items.toString();
	}

}
