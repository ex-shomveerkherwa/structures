package preparation.walmart.binaryTreeOps;

import java.util.LinkedList;
import java.util.Queue;

import preparation.walmart.structures.BinaryTree;
import preparation.walmart.structures.BinaryTreeNode;

public class LevelOrderApp {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		BinaryBiolerPlate.initializeBinaryTree(tree);
		
		printLevelOrder(tree);
		System.out.println("Level Order traversal");

	}

	private static void printLevelOrder(BinaryTree tree) {
		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		
		queue.add(tree.root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode node = queue.remove();
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
			System.out.println("\t"+node.key);
		}
		
	}

}
