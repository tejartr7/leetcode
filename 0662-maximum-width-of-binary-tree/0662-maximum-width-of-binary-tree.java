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
    public void helper(TreeNode root,int index)
    {
        if(root==null)
        return ;
        root.val=index;
        helper(root.left,2*index+1);
        helper(root.right,2*index+2);
    }
    public int widthOfBinaryTree(TreeNode root) {
        helper(root,0);
        int maxi=0;
        if(root==null)
        return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> list=new ArrayList<>();
        list.add(root.val);
        while(!q.isEmpty())
        {
            int i,n=q.size();
            for(i=0;i<n;i++)
            {
                TreeNode x=q.poll();
                if(x.left!=null)
                q.add(x.left);
                if(x.right!=null)
                q.add(x.right);
                list.add(x.val);
            }
            //Collections.sort(list);
            maxi=Math.max(maxi,list.get(list.size()-1)-list.get(0)+1);
            System.out.println(list);
            list.clear();
        }
        return maxi;
    }
}