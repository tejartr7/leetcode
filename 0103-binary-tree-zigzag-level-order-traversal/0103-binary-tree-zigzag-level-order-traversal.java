
import java.io.*;
import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)
        return result;
        boolean flag=false;
        q.offer(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            LinkedList<Integer> temp=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode node=q.poll();
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
                if(flag)
                temp.addFirst(node.val);
                else
                temp.addLast(node.val);
            }
            result.add(temp);
            flag=!flag;
        }
        return result;
    }
}