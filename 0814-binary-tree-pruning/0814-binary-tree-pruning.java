/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean contains1(TreeNode root)
    {
        if(root==null) return false;
        if(root.val==0 && root.left==null && root.right==null)
            return false;
        if(root.val==1)
            return true;
        return contains1(root.left)||contains1(root.right);
    }
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return root;
        boolean left=contains1(root.left);
        boolean right=contains1(root.right);
        //System.out.println(left+" "+right);
        if(!left) root.left=null;
        if(!right)root.right=null;
        if(root.val==0 && left==false && right==false) return null;
        pruneTree(root.left);
        pruneTree(root.right);
        return root;
    }
}