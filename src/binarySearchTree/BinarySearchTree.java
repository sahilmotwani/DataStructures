package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;



public class BinarySearchTree<T> {

	BstNode<T> root;

	public void addNode(int key,T data){
		BstNode<T> newNode = new BstNode<T>(key,data);
		if(root==null){
			root=newNode;
		}
		else{
			BstNode<T> currentNode = root;
			BstNode<T> parent;

			while(true){
				parent=currentNode;
				if(key < currentNode.getKey()){
					currentNode=currentNode.getLeft();
					if(currentNode==null){
						parent.setLeft(newNode);
						return;
					}
				}
				else{
					currentNode=currentNode.getRight();
					if(currentNode==null){
						parent.setRight(newNode);
						return;
					}
				}
			}
		}
	}



	public BstNode<T> findNode(int key){
		BstNode<T> currentNode = root;
		while(currentNode.getKey()!=key){
			if(key<currentNode.getKey()){
				currentNode=currentNode.getLeft();
			}else{
				currentNode=currentNode.getRight();
			}
			if(currentNode==null){
				return null;
			}
		}
		return currentNode;
	}

	//In-order traversal to print in ascending order
	public void inOrderTraverse(BstNode<T> currentNode){
		if(currentNode != null){
			inOrderTraverse(currentNode.getLeft());
			System.out.print(currentNode);
			inOrderTraverse(currentNode.getRight());
		}
	}

	public void postOrderTraverse(BstNode<T> currentNode){
		if(currentNode!=null)
			postOrderTraverse(currentNode.getLeft());
		postOrderTraverse(currentNode.getRight());
		System.out.println(currentNode);
	}
	public void preOrderTraverse(BstNode<T> currentNode){
		if(currentNode != null){
			System.out.print(currentNode);
			preOrderTraverse(currentNode.getLeft());
			preOrderTraverse(currentNode.getRight());
		}
	}

	public void levelOrder(BstNode<T> root){
		if(root==null)
			return;
		Queue<BstNode<T>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			root=queue.poll();
			System.out.println(root.data);
			if(root.left!=null)
				queue.add(root.left);
			if(root.right!=null)
			queue.add(root.right);
		}

	}

	//longest path from root node to the leaf node
	public int findHeight(BstNode<T> root){
		if(root==null)
			return 0;
		int leftHeight=findHeight(root.getLeft());
		int rightHeight=findHeight(root.getRight());
		return Math.max(leftHeight,rightHeight)+1;
	}
}
