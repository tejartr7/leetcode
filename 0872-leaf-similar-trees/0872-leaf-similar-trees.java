import java.util.*;
class Solution {
    public void inorder(TreeNode root,List<Integer> set)
    {
        if (root != null) {
            if (root.left == null && root.right == null)
                set.add(root.val);
            inorder(root.left, set);
            inorder(root.right, set);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        inorder(root1,s1);
        inorder(root2,s2);
        return s1.equals(s2);
    }
}