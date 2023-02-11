class rtr
{
    TreeNode node;
    int row;
    int col;
    rtr(TreeNode node,int row,int col)
    {
        this.node=node;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<rtr> q=new LinkedList<rtr>();
        q.offer(new rtr(root,0,0));
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        while(!q.isEmpty())
        {
            rtr top=q.poll();
            TreeNode node=top.node;
            int r=top.row;
            int c=top.col;
            if(!map.containsKey(r))
                map.put(r,new TreeMap<>());
            if(!map.get(r).containsKey(c))
                map.get(r).put(c,new PriorityQueue<>());
            map.get(r).get(c).add(node.val);
            if(node.left!=null)
                q.offer(new rtr(node.left,r-1,c+1));
            if(node.right!=null)
                q.offer(new rtr(node.right,r+1,c+1));
        }
         for(TreeMap<Integer,PriorityQueue<Integer>> m:map.values())
        {
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq:m.values())
            {
                while(pq.size()>0)
                {
                    list.get(list.size()-1).add(pq.poll());
                }
            }
        }
        return list;
    }
}