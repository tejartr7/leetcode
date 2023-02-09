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
    int index=0;
    public void helper(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return ;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
    public void recoverTree(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        int x[]=new int[2];
        Arrays.fill(x,-1);
        x=get(list);
      //  System.out.println(x[0]+" "+x[1]);
        if(x[1]==-1)
            x[1]=x[0]+1;
        int a=list.get(x[0]),b=list.get(x[1]);
        list.set(x[0],b);
        list.set(x[1],a);
        //System.out.println(list);
        creater(list,root);
    }
    public int[] get(List<Integer> list)
    {
        int x[]=new int[2];
        x[0]=x[1]=-1;
        int k=0;
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i-1)>list.get(i))
            {
                if(k==0)
                x[k++]=i-1;
                else if(k==1)
                    x[k++]=i;
                if(k==2) break;
            }
        }
        return x;
    }
    public void creater(List<Integer> list,TreeNode root)
    {
        if(index>=list.size()) return ;
        if(root==null) return ;
        creater(list,root.left);
        root.val=list.get(index);
        index++;
        creater(list,root.right);
    }
}