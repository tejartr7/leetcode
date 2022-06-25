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
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> a=new ArrayList<>();
      find(a,root);  
        return a;
    }
    public void find(List<Integer>a,TreeNode root)
    {
        if(root!=null)
        {
            find(a,root.left);
            find(a,root.right);
            a.add(root.val);
        }
    }
}