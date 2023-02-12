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
    public void inorder(TreeNode root,int maxi,int mini,int ans[])
    {
        if(root==null) return ;
        if(maxi!=Integer.MIN_VALUE)
            ans[0]=Math.max(ans[0],Math.abs(root.val-maxi));
        if(mini!=Integer.MAX_VALUE)
            ans[0]=Math.max(ans[0],Math.abs(root.val-mini));
        inorder(root.left,Math.max(maxi,root.val),Math.min(mini,root.val),ans);
        inorder(root.right,Math.max(maxi,root.val),Math.min(mini,root.val),ans);
    }
    public int maxAncestorDiff(TreeNode root) {
        int ans[]=new int[1];
        ans[0]=0;
        inorder(root,Integer.MIN_VALUE,Integer.MAX_VALUE,ans);
        return ans[0];
    }
}