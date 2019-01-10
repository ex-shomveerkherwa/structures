package preparation.walmart.binaryTreeOps;

import java.util.HashSet;
import java.util.Set;

import preparation.walmart.structures.BinaryTree;
import preparation.walmart.structures.BinaryTreeNode;

public class LeftViewOfTree {

	static Set<Integer> visitedLevel = new HashSet<Integer>();
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		BinaryBiolerPlate.initializeBigBinaryTree(tree);

		System.out.println("Level Order traversal");
		printLevelOrder(tree);

	}

	private static void printLevelOrder(BinaryTree tree) {
		
		int h = BinaryBiolerPlate.getHeight(tree);
		System.out.println("height "+h);
		for(int i=1;i<=h;i++) {
			printAtLevel(tree.root,i,i);
		}
		
	}

	private static void printAtLevel(BinaryTreeNode node, int i, int level) {
		if(node == null)
			return;
		else if (i == 1 && !visitedLevel.contains(level)) {
			System.out.println(node.key);
			visitedLevel.add(level);
		}else {
			printAtLevel(node.left,i-1,level);
			printAtLevel(node.right,i-1,level);
		}
			
	}

}
