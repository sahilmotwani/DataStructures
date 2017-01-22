package binarySearchTree;

public class BstNode<T> {
	int key;
	T data;
	BstNode<T> left;
	BstNode<T> right;

	public BstNode(int key,T data){
		this.key=key;
		this.data=data;
	}
	
	public BstNode() {
	}

	public String toString(){
		return ""+data;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BstNode<T> getLeft() {
		return left;
	}

	public void setLeft(BstNode<T> left) {
		this.left = left;
	}

	public BstNode<T> getRight() {
		return right;
	}

	public void setRight(BstNode<T> right) {
		this.right = right;
	}
}
