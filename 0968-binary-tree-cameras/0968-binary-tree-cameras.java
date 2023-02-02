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
    /* similar to gfg number of nodes to light up
    //https://practice.geeksforgeeks.org/problems/f7bfa137576243795abb0595962d61b632bbad21/1 this is the question on gfg*/
    int count=0;
    public int helper(TreeNode root)
    {
        if(root==null)
            return 0;
        int x=helper(root.left);
        int y=helper(root.right);
        if(x==-1 || y==-1)
        {
            count++;
            return 1;
        }
        if(x==1 || y==1)
            return 0;
        return -1;
    }
    public int minCameraCover(TreeNode root) {
        return helper(root)<0?++count:count;
    }
}