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
    public List<Integer> rightSideView(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<Integer> list=new ArrayList<Integer>();
        if(root==null)
            return list;
        q.add(root);
        while(q.size()>0){
            Queue<TreeNode> newq=new LinkedList<TreeNode>();
            Integer val=null;
            while(q.size()>0){
                TreeNode node=q.remove();
                val=node.val;
                if(node.left!=null)
                    newq.add(node.left);
                if(node.right!=null)
                    newq.add(node.right);
            }
            q=newq;
            if(val!=null)
                list.add(val);
        }
        return list;
    }
}