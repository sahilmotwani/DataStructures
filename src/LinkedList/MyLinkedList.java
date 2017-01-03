package LinkedList;

public class MyLinkedList<T> {

	Node<T> head;
	Node<T> tail;
	int size = 0;
	public void add(T data){
		//scenario 1: Empty linkedList
		Node<T> node = new Node<T>(data);
		if(tail==null){
			head=node;
			tail=node;
		}
		else{
			//scenario 2 : Non-empty linkedList
			tail.setNext(node);
			tail=node;
		}
		size++;
	}
	
	public Node<T> delete(T data){
		Node<T> nodeToReturn;
		if(size==0){
			return null;
		}
		if(size==1){
			nodeToReturn = head;
			head=null;
			tail=null;
			size--;
			return nodeToReturn;
		}
		Node<T> node = findBeforeNode(data);
		
		if(node!=null){
			//case where we need to delete the head
			if(node.getData()==null){
				head=node.getNext();
			}
			if(tail.getData()==data){
				tail=node;
				node.setNext(null);
			}
			else{
			node.setNext(node.getNext().getNext());
			}
			size--;
			return node;
		}
		
		
		return null;
	}
	
	public Node<T> findBeforeNode(T data){
		//empty linked list
		if(head==null){
			return new Node();
		}
		if(head.getData()==data){
			return head;
		}
		Node<T> node = head;
		while(node.getNext() != null){
			node.getNext();
			if(node.getNext().getData()==data)
				return node;
		}
		return null;
	}
	
	public Node<T> find(T data){
		//empty linked list
		if(head==null){
			return null;
		}
		if(head.getData()==data){
			return head;
		}
		Node<T> node = head;
		while(node.getNext() != null){
			node=node.getNext();
			if(node.getData()==data)
				return node;
		}
		return null;
	}
}
