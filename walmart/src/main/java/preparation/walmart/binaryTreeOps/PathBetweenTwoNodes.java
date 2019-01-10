package preparation.walmart.binaryTreeOps;

import java.util.ArrayList;
import java.util.List;

import preparation.walmart.structures.BinaryTree;
import preparation.walmart.structures.BinaryTreeNode;

public class PathBetweenTwoNodes {
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		int number1 = 11;
		int number2= 7;
		BinaryBiolerPlate.initializeBigBinaryTree(tree);

		System.out.println("Path from root ");
		
		List<Integer> path1 =getPath(tree.root,number1);
		List<Integer> path2 =getPath(tree.root,number2);
		
		if(path1 == null || path2 == null) {
			
		}
		
		System.out.println("path1");
		for(int i : path1) {
			System.out.print("\t"+i);
		}
		
		System.out.println("path2");
		for(int i : path2) {
			System.out.print("\t"+i);
		}
		
	}

	private static List getPath(BinaryTreeNode node, int number) 
	{
	
		List<Integer> pathList = new ArrayList<Integer>();
		
		boolean result = pathFromRoot(node,pathList,number);
		
		if(result)
			return pathList;
		else
			return null;
		
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
