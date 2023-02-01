class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        return ans;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root,prev=null;
        while(true)
        {
           if(curr!=null)
           {
               stack.push(curr);
               curr=curr.left;
           }
           else
           {
               if(stack.isEmpty())
                   break;
               TreeNode node=stack.pop();
               ans.add(node.val);
               curr=node.right;
           }
        }
        return ans;
    }
}