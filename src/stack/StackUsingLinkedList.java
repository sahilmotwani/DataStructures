package stack;

import java.util.LinkedList;

import LinkedList.MyLinkedList;

public class StackUsingLinkedList<T> {

	MyLinkedList<Integer> stackList = new MyLinkedList<>();
	public void push(int data) {
	    stackList.addFirst(data);
	}

	public void pop() {
	    stackList.removeFirst();
	}

	public void traverse() {
	   
	    	stackList.traverse();
	  }
	
}
