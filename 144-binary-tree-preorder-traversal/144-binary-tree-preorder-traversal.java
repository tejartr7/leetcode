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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        find(root,a);
        return a;
    }
    public void find(TreeNode root,List<Integer> a)
    {if(root!=null){
        a.add(root.val);
        find(root.left,a);
        find(root.right,a);
    }
    }
}