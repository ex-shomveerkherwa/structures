package preparation.walmart.binaryTreeOps.traversals;

import java.util.Stack;

import preparation.walmart.binaryTreeOps.BinaryBiolerPlate;
import preparation.walmart.structures.BinaryTree;
import preparation.walmart.structures.BinaryTreeNode;

public class PreOrderStack {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		BinaryBiolerPlate.initializeBinaryTree(tree);
		
		
		System.out.println("Pre Order traversal");
		preOrderTraversal(tree.root);
	}

	private static void preOrderTraversal(BinaryTreeNode node) {
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		stack.add(node);
		while(!stack.isEmpty()) {
			BinaryTreeNode current = stack.pop();
			System.out.println(current.key);
			if(current.right != null)
				stack.push(current.right);
			if(current.left != null)
				stack.push(current.left);
		}
		
	}

}
