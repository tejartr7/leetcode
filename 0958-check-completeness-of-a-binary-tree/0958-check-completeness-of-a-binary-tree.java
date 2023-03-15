class Solution {
    int count=0;
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        count=1+countNodes(root.left)+countNodes(root.right);
        return count;
    }
    public boolean dfs(TreeNode root,int index,int n)
    {
        if(root==null) return true;
        //because in complete binary tree child notes will be at 2i+1 and 2i+2
        // if they are not at those place that means it is not a complete binary tree
        if(index>=n)   return false;
        return dfs(root.left,2*index+1,n) && dfs(root.right,2*index+2,n);
    }
    public boolean isCompleteTree(TreeNode root) {
       countNodes(root);
       return dfs(root,0,count);
    }
}