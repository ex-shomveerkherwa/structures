package preparation.walmart.binaryTreeOps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import preparation.walmart.structures.BinaryTree;
import preparation.walmart.structures.BinaryTreeNode;

public class TopViewOfTree {

	static Map<Integer,List<BinaryTreeNode>> visitedLevel = 
			new HashMap<Integer,List<BinaryTreeNode>>();
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		BinaryBiolerPlate.initializeBigBinaryTree(tree);
		
		System.out.println("Top View Of Tree");
		
		List<BinaryTreeNode> level0 = new ArrayList<BinaryTreeNode>();
		level0.add(tree.root);
		visitedLevel.put(0,level0 );
		
		topViewOfBinaryTree(tree.root,0);
		
		for(Map.Entry<Integer,List<BinaryTreeNode>> entry: visitedLevel.entrySet()) {
			System.out.println(entry.getValue().get(0).key); 
		}
	}
	
	//internally we are doing a pre order along with a distant field
	private static void topViewOfBinaryTree(BinaryTreeNode node, int hd) {
		
		if(node == null)
			return;
		
		if(!visitedLevel.containsKey(hd)) {
			List<BinaryTreeNode> level = new ArrayList<BinaryTreeNode>();
			level.add(node);
			visitedLevel.put(hd, level);
		}
		topViewOfBinaryTree(node.left,hd-1);
		topViewOfBinaryTree(node.right,hd+1);
	}
}
