package stack;

import java.util.Arrays;

public class StackUsingArray<T> {
	private T stackArray[];
	private int top=-1;
	private int array_length=50;
	
	@SuppressWarnings("unchecked")
	public StackUsingArray(){
		stackArray=(T[]) new Object[array_length];
	}
	
	public void push(T data){
		if(top==array_length-1){
			array_length=array_length*2;
			stackArray = Arrays.copyOf(stackArray, array_length);
		}
		top++;
		stackArray[top]=data;
	}
	
	public T pop(){
		T popData= stackArray[top];
		top--;
		return popData;
	}
	
	public T top(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void traverse(){
		for(int i=0;i<=top;i++){
			System.out.print(" "+stackArray[i]);
		}
	}
}
