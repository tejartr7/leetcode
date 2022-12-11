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
    int max=Integer.MIN_VALUE;
    public int inorder(TreeNode root)
    {
        if(root==null)
            return 0;
        int l=Math.max(inorder(root.left),0);
        int r=Math.max(inorder(root.right),0); 
        max=Math.max(max,l+r+root.val);
        return Math.max(l+root.val,r+root.val);
    }
    public int maxPathSum(TreeNode root) {
        inorder(root);
        return max;
    }
}