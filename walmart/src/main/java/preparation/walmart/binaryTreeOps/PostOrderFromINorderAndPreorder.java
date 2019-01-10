package preparation.walmart.binaryTreeOps;

import preparation.walmart.structures.BinaryTree;

public class PostOrderFromINorderAndPreorder {
	
	static BinaryTree tree = new BinaryTree();
	static int rootIndex = 0;
	
	public static void main (String args[]) {
		int in[] = {8,7,9};
		int pre[] = {7,8,9};
		int len = in.length-1;
		
		System.out.println("Post Order ");
		printPost(in,pre,0,len);
		
	}

	private static void printPost(int[] in, int[] pre, int start, int end) {
	
		if(start > end)
			return;
		
		int inIndex = search(in,start,end,pre[rootIndex++]);
		
		printPost(in,pre,start,inIndex-1);
		printPost(in ,pre,inIndex+1,end);
		
		System.out.print(in[inIndex]+" ");
		
	}

	private static int search(int[] in, int start, int end, int key) {
		int i=0;
		for(i=0;i<=end;i++) {
			if(in[i] == key)
				return i;
		}
		return i;
	}

}
