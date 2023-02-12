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
    int ans=0;
    public void inorder(TreeNode root,int maxi,int mini)
    {
        if(root==null) return ;
        if(maxi!=Integer.MIN_VALUE)
            ans=Math.max(ans,Math.abs(root.val-maxi));
        if(mini!=Integer.MAX_VALUE)
            ans=Math.max(ans,Math.abs(root.val-mini));
        inorder(root.left,Math.max(maxi,root.val),Math.min(mini,root.val));
        inorder(root.right,Math.max(maxi,root.val),Math.min(mini,root.val));
    }
    public int maxAncestorDiff(TreeNode root) {
        inorder(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return ans;
    }
}