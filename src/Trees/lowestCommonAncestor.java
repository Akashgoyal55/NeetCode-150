package Trees;
/*
We will use recursion here, start from the root of the binary tree
Here ancestor means the previous elements
 */
public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

        if(root==null) return null; //when root is null there is no ancestor
        if(root==p || root==q) return null;

        TreeNode left = lowestCommonAncestor(root.left, p,q);  //traverse left
        TreeNode right = lowestCommonAncestor(root.right, p, q); //traverse right

        if(left==null) return right; //when we traversed left and found nothing
        if(right==null) return left;  //when traversed right and found nothing

        return root;
    }
}
