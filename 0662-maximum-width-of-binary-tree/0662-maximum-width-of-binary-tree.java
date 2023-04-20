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
class pair
{
    TreeNode node;
    int index;
    pair(TreeNode node,int index)
    {
        this.node=node;
        this.index=index;
    }
}
class Solution {
    void inorder(TreeNode root,int i)
    {
        if(root==null)
        return ;
        root.val=i;
        inorder(root.left,2*i+1);
        inorder(root.right,2*i+2);
    }
    public int widthOfBinaryTree(TreeNode root) {
        int max=1;
        Queue<pair> q=new LinkedList<pair>();
        q.add(new pair(root,0));
        while(!q.isEmpty())
        {
            int f=0,l=0;
            int i;
            int min=q.peek().index;
            int n=q.size();
            for(i=0;i<n;i++)
            {   
                int curr=q.peek().index-min;
                if(i==0)
                f=q.peek().index;
                if(i==n-1)
                l=q.peek().index;
                if(q.peek().node.left!=null)
                q.offer(new pair(q.peek().node.left,curr*2+1));
                if(q.peek().node.right!=null)
                q.offer(new pair(q.peek().node.right,curr*2+2));
                q.poll();
            }
            max=Math.max(max,l-f+1);
        }
        return max;
    }
}