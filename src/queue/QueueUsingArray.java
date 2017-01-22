package queue;

import java.util.Arrays;

/**
 * @author sahil
 *
 * @param <T>
 * 
 * Using the array in cyclic fashion for code efficiency. Also it is dynamic.
 * Check for correctness using arrayLength=5
 */

public class QueueUsingArray<T> {
	T queueArray[];
	int arrayLength=50;
	int front=-1;
	int rear=-1;
	
	@SuppressWarnings("unchecked")
	public QueueUsingArray(){
		queueArray = (T[]) new Object[arrayLength];
	}

	@SuppressWarnings("unchecked")
	public void enqueue(T data){
		if((rear+1)%arrayLength==front){
			T tempArray[]=(T[]) new Object[arrayLength*2];
			if(rear<=front){
				System.arraycopy(queueArray, 0, tempArray, 0, rear+1);
				System.arraycopy(queueArray, front, tempArray, arrayLength*2-(arrayLength-front), arrayLength-front);
				front=arrayLength*2-(arrayLength-front);
			}
			else{
				System.arraycopy(queueArray, front, tempArray, front, rear-front);
			}
			queueArray=tempArray;
			arrayLength=arrayLength*2;
		}
		if(isEmpty()){
			rear=0;front=0;	
		}
		else{
			rear=(rear+1)%arrayLength;
		}
		queueArray[rear]=data;
	}

	public T front(){
		if(rear==-1)
			return null;
		else{
			return queueArray[front];
		}
	}

	public T dequeue(){
		if(rear==-1)
			return null;
		else{
			int temp=front;
			if(front==rear){
				front=0;
				rear=-1;
				return queueArray[temp];
			}
			front=(front+1)%arrayLength;
			return queueArray[temp];
		}
	}
	public boolean isEmpty(){
		if(rear==-1)
			return true;
		return false;
	}

	public void traverse(){
		if(rear<=front){
			for(int i=front;i<arrayLength;i++){
				System.out.print(" "+queueArray[i]);
			}
			for(int i=0;i<=rear;i++){
				System.out.print(" "+queueArray[i]);
			}
		}
		else{
			for(int i=front;i<=rear;i++){
				System.out.print(" "+queueArray[i]);
			}
		}
	}
}
