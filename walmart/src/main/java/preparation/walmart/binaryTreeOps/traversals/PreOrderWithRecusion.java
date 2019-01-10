package preparation.walmart.binaryTreeOps.traversals;

import preparation.walmart.binaryTreeOps.BinaryBiolerPlate;
import preparation.walmart.structures.BinaryTree;
import preparation.walmart.structures.BinaryTreeNode;

public class PreOrderWithRecusion {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		BinaryBiolerPlate.initializeBinaryTree(tree);
		
		
		System.out.println("Pre Order traversal");
		preOrderTraversal(tree.root);
	}

	private static void preOrderTraversal(BinaryTreeNode node) {
		
		if(node == null)
			return;
		System.out.println(node.key);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

}
