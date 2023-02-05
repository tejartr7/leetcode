
class Solution {
    public int helper(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(left<0 || right<0)
            return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        return helper(root)>=0;
    }
}