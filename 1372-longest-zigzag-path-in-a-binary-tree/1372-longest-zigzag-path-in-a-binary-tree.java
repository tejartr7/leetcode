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
    int maxi=0;
    TreeNode parent;
    public boolean isLeaf(TreeNode root)
    {
        return root!=null && root.left==null && root.right==null;
    }
    public void helper(TreeNode root,int dir,int len)
    {
        if(root==null) 
        return ;
        maxi=Math.max(maxi,len);
        if(dir==1)
        {
            helper(root.left,0,len+1);
            helper(root.right,1,1);
        }
        else
        {
            helper(root.left,0,1);
            helper(root.right,1,len+1);
        }
    }
    public int longestZigZag(TreeNode root) {
        parent=root;
        if(isLeaf(root)) return 0;
        helper(root,0,0);
        helper(root,1,0);
        return maxi;
    }
}