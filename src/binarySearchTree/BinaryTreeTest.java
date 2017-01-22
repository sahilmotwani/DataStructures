package binarySearchTree;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void TestBST(){

		BinarySearchTree<Integer> tree = new BinarySearchTree<>();

		tree.addNode(5, 5);
		tree.addNode(3, 3);
		tree.addNode(2, 2);
		tree.addNode(4, 4);
		tree.addNode(7, 7);
		tree.addNode(8, 8);
		tree.preOrderTraverse(tree.root);
		System.out.println();
		tree.levelOrder(tree.root);
		System.out.println("Height of tree is : " + 
				tree.findHeight(tree.root));
	}
}

