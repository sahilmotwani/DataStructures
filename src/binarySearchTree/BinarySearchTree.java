package binarySearchTree;

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

	public void preOrderTraverse(BstNode<T> currentNode){
		if(currentNode != null){
			System.out.print(currentNode);
			inOrderTraverse(currentNode.getLeft());
			inOrderTraverse(currentNode.getRight());
		}
	}
}
