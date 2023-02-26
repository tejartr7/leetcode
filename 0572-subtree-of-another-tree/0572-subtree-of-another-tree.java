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
    public List<Integer> inorder(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return list;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        return list;
    }
    public List<Integer> preorder(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return list;
        list.add(root.val);
        inorder(root.left,list);
        inorder(root.right,list);
        return list;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot!=null) return false;
        if(root==null && subRoot==null) return true;
        List<Integer> list=new ArrayList<>();
        list=inorder(subRoot,list);
        List<Integer> pre=new ArrayList<>();
        pre=preorder(subRoot,pre);
        List<Integer> list1=new ArrayList<>();
        list1=inorder(root,list1);
        List<Integer> pre1=new ArrayList<>();
        pre1=preorder(root,pre1);
        if(list1.equals(list) && pre1.equals(pre))
            return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}