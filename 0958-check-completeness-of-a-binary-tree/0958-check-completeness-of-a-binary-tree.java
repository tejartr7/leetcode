class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int i,n=q.size();
            List<Integer> sublist=new ArrayList<>();
            for(i=0;i<n;i++)
            {
                TreeNode top=q.poll();
                if(top.val==-1)
                {
                    sublist.add(-1);
                    continue;
                }
                if(top.left!=null)
                    q.offer(top.left);
                if(top.left==null)
                    q.offer(new TreeNode(-1));
                if(top.right!=null)
                    q.offer(top.right);
                if(top.right==null)
                    q.offer(new TreeNode(-1));
                if(top.val!=-1)
                    sublist.add(top.val);
            }
            list.add(sublist);
        }
        //System.out.println(list);
        int i;
        for(i=0;i<list.size()-1;i++)
        {
            boolean found=false;
            boolean pos=false;
            for(int x:list.get(i))
            {
                if(x==-1 && i!=list.size()-2)
                    return false;
                if(x==-1 && !found)
                {
                    found=true;
                }
                else if(found && x>0) 
                    return false;
            }
        }
        return true;
    }
}