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
    public int[] helper(TreeNode root)
    {
        if(root==null)
            return new int[2];
        int left[]=helper(root.left);
        int right[]=helper(root.right);
        int withRoot=left[1]+right[1]+root.val;
        int withOutRoot=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{withRoot,withOutRoot};
    }
    public int rob(TreeNode root) {
        int sum[]=helper(root);
        return Math.max(sum[0],sum[1]);
    }
}