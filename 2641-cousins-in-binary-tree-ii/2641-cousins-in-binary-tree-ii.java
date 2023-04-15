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
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,null));
        int lastLevelChildSum=0;
        int currLevelChildSum=0;
        Map<TreeNode, Integer> map = new HashMap<>();   
        while(!q.isEmpty())
        {
            lastLevelChildSum=currLevelChildSum;
            currLevelChildSum=0;
            int n=q.size();
            while(n-->0)
            {
                int childSumOfNodes=0;
                Pair top=q.poll();
                TreeNode node=top.node;
                TreeNode parent=top.parent;
                if(node.right!=null)
                {
                    q.offer(new Pair(node.right,node));
                    childSumOfNodes+=node.right.val;
                }
                if(node.left!=null)
                {
                    q.offer(new Pair(node.left,node));
                    childSumOfNodes+=node.left.val;
                }
                map.put(node,childSumOfNodes);
                currLevelChildSum+=childSumOfNodes;
                node.val=lastLevelChildSum-map.getOrDefault(parent,0);
            }
        }
        return root;
    }
}