import java.util.* ;
import java.io.*; 
/****************************************************
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*****************************************************/
public class MaxDepth 
{
	public static int findMaxDepth(BinaryTreeNode<Integer> root) 
	{
		// WRITE YOUR CODE HERE 
		if(root==null){
			return 0;
		}

		int lf=findMaxDepth(root.left);
		int rt=findMaxDepth(root.right);

		int max=1+Math.max(lf,rt);

		return max;
	}
}