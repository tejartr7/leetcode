public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
     Queue <TreeNode> q = new LinkedList <TreeNode>();
      List<List<Integer>> list = new LinkedList <List<Integer>>();
      if(root == null)
        return list;
      
      q.offer(root);
      while(!q.isEmpty()) {
        int num = q.size();
        List<Integer> subList = new LinkedList<Integer>();
        for(int i = 0; i < num; i ++) {
          if(q.peek().left != null)
            q.offer(q.peek().left);
           if(q.peek().right != null)
            q.offer(q.peek().right);
          subList.add(q.poll().val);
        }
        list.add(subList);
      }
      return list;
    }
}