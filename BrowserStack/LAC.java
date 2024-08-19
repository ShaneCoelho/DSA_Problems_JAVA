/************************************************************

 Following is the TreeNode class structure

 class TreeNode<T>
 {
     T data;
     TreeNode<T> left;
     TreeNode<T> right;

     TreeNode(T data)
     {
         this.data = data;
         left = null;
         right = null;
     }
 };

 ************************************************************/

 public class LAC {
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
        //    Write your code here.

        TreeNode<Integer> node=LCA(root,x,y);

        int ans=node.data;

        return ans;
    }

    public static TreeNode<Integer> LCA(TreeNode<Integer> root, int x, int y){

        if(root==null || root.data==x || root.data==y){
            return root;
        }

        TreeNode<Integer> left=LCA(root.left,x,y);
        TreeNode<Integer> right=LCA(root.right,x,y);

        if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return root;
        }
    }
}