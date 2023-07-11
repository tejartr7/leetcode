/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class pair
{
    TreeNode root;
    int lvl;
    pair(TreeNode x,int y)
    {
        root=x;
        lvl=y;
    }
}
class Solution {
    Map<TreeNode,TreeNode> map;
    TreeNode x;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        map=new HashMap<>();
        x=null;
        //helper(root,target);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        while(!q.isEmpty())
        {
            TreeNode top=q.poll();
            if(top.val==target.val)
                x=top;
            if(top.left!=null)
            {
                map.put(top.left,top);
                q.offer(top.left);
            }
            if(top.right!=null)
            {
                map.put(top.right,top);
                q.offer(top.right);
            }
        }
        Set<TreeNode>vis=new HashSet<>();
        Queue<pair> temp=new LinkedList<>();
        temp.offer(new pair(x,0));
        vis.add(x);
        while(!temp.isEmpty())
        {
            pair top=temp.poll();
            int lvl=top.lvl;
            if(lvl==k)
            {
                list.add(top.root.val);
            }
            if(top.root.left!=null && !vis.contains(top.root.left) && lvl+1<=k)
            {
                temp.offer(new pair(top.root.left,lvl+1));
                vis.add(top.root.left);
            }
            if(top.root.right!=null && !vis.contains(top.root.right) && lvl+1<=k)
            {
                temp.offer(new pair(top.root.right,lvl+1));
                vis.add(top.root.right);
            }
            if(map.containsKey(top.root) && lvl+1<=k && !vis.contains(map.get(top.root)))
            {
                temp.offer(new pair(map.get(top.root),lvl+1));
                vis.add(map.get(top.root));
            }
        }
        return list;
    }
}