class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                preorder.add(curr.val);
                curr=curr.right;
            }
            else
            {
                TreeNode prev=curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if(prev.right==curr)
                {
                    prev.right=null;
                    curr=curr.right;
                }
                else
                {
                    preorder.add(curr.val);
                    prev.right=curr;
                    curr=curr.left;
                }
            }
        }
        return preorder;
    }
}