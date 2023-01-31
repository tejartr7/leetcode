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
    int sum=0;
    public void grandChild(TreeNode root,int level)
    {
        if(root==null)
            return ;
        if(level==2)
        {
            sum+=root.val;
        }
        grandChild(root.left,level+1);
        grandChild(root.right,level+1);
    }
    public void preorder(TreeNode root)
    {
        if(root==null)
            return ;
        if(root.val%2==0)
        {
            grandChild(root,0);
        }
        preorder(root.left);
        preorder(root.right);
    }
    public int sumEvenGrandparent(TreeNode root) {
        preorder(root);
        return sum;    
    }
}