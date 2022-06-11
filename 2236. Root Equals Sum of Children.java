class Solution {
    public boolean checkTree(TreeNode root) {
    if(root.val==root.left.val+root.right.val)
        return true;
    else
        return false;
    }
}
