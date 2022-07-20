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
    public boolean findTarget(TreeNode root, int k) {
    HashSet<Integer>a=new HashSet<>();
        return find(root,k,a);
    
    }
    private boolean find(TreeNode root,int k,HashSet a)
    {
        
        if(root==null)
            return false;
        if(a.contains(k-root.val))
            return true;
        else
        {
            a.add(root.val);
            return find(root.right,k,a)||find(root.left,k,a);
        }
    }
    
}