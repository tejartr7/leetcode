class Solution {
    int count=0;
    public int counter(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+counter(root.left)+counter(root.right);
    }
    public int sum(TreeNode root)
    {
        if(root==null)
            return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public void helper(TreeNode root)
    {
       if(root==null)
           return ;
        if(root.left==null && root.right==null)
        {
            count++;
            return ;
        }
        int a=sum(root.left);
        int b=counter(root.left);
        int x=sum(root.right);
        int y=counter(root.right);
        int s=a+x;
        int n=b+y;
        if((s+root.val)/(n+1)==root.val)
        {
            count++;
        }
        helper(root.left);
        helper(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }
}