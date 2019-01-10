package preparation.walmart.binaryTreeOps;

import java.util.ArrayList;
import java.util.List;

import preparation.walmart.structures.BinaryTree;
import preparation.walmart.structures.BinaryTreeNode;

public class PathFromRoot {

	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		int number = 11;
		BinaryBiolerPlate.initializeBigBinaryTree(tree);

		System.out.println("Path from root ");
		
		getPath(tree.root,number);
		
	}

	private static void getPath(BinaryTreeNode node, int number) 
	{
	
		List<Integer> pathList = new ArrayList<Integer>();
		
		//boolean result = pathFromRoot(node,pathList,number);
			
			if( pathFromRoot(node,pathList,number)) {
				for(int i : pathList) {
					System.out.print("\t"+i);
				}
			}else {
				System.out.println("no path");
			}
		
	}

	private static boolean pathFromRoot(BinaryTreeNode node,List<Integer> pathList,int number) {
		
		if(node == null)
			return false;
		
		pathList.add(node.key);
		
		if(node.key == number)
			return true;
		
		if(pathFromRoot(node.left,pathList,number)) 
			return true;
		
		if(pathFromRoot(node.right,pathList,number))
			return true;
		
		pathList.remove(pathList.size()-1);
		
		return false;
	}

	
}
