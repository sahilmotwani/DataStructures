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
	
	public void addFirst(T data){
		Node<T> node = new Node<T>(data);
		node.setNext(head);
		head=node;
	}
	
	public T removeFirst(){
		Node<T> old = head;
		head=head.getNext();
		return old.getData();
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
	
	public void reverse(){
		if(head==null)
			return;
		Node current=head;
		Node previous = null;
		Node next;
		while(current!=null){
			next=current.getNext();
			current.setNext(previous);
			previous=current;
			current=next;
		}
	}
	
	public void traverse(){
		traversal(head);
	}
	public void traversal(Node p){
		if(p==null){ 
			return;
		}
		traversal(p.getNext());
		System.out.format("%d ",p.getData());
	}
	public void reverse(Node p){
		if(p.getNext()==null){
			head=p;
			return;
		}
		reverse(p.getNext());
		Node q=p.getNext();
		q.setNext(p);
		p.setNext(null);
	}
	public void addFirst(Node n){
		
	}
}
