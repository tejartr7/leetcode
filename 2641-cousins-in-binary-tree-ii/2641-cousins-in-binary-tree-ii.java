  class Pair{
        TreeNode node;
        TreeNode parent;
        public Pair(TreeNode n, TreeNode p){
            node = n;
            parent = p;
        }
    }
    
class Solution {
  
    public TreeNode replaceValueInTree(TreeNode root) {
        // same depth diff parent
        List<Integer> list=new ArrayList<>();
        Map<TreeNode,Integer> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int sum=0;
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode node=q.poll();
                sum+=node.val;
                int x=0;
                if(node.left!=null)
                    {x+=node.left.val;
                    q.offer(node.left);}
                if(node.right!=null)
                    {x+=node.right.val;
                    q.offer(node.right);}
                map.put(node,x);
            }
            list.add(sum);
        }
        System.out.println(list);
        int level=0;
        Queue<Pair> ans=new LinkedList<>();
        ans.offer(new Pair(root,null));
        while(!ans.isEmpty())
        {
            int n=ans.size();
            for(int i=0;i<n;i++)
            {
                Pair top=ans.poll();
                TreeNode node=top.node;
                TreeNode parent=top.parent;
                int x=node.val;
                node.val=list.get(level)-map.getOrDefault(parent,x);
                if(node.left!=null)
                {
                   ans.offer(new Pair(node.left,node));
                }
                if(node.right!=null)
                {
                    ans.offer(new Pair(node.right,node));
                }
            }
            level++;
        }
        return root;
    }
}