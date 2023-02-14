class Solution {
    public boolean isLeaf(TreeNode root)
    {
        return root!=null && root.left==null && root.right==null;
    }
    public void dfs(TreeNode root,int targetSum,List<List<Integer>> result,
                   List<Integer> list)
    {
        if(root==null) return ;
        //System.out.println(list);
        list.add(root.val);
        if(targetSum==root.val)
        {
            //list.add(root.val);
            if(isLeaf(root)) 
                result.add(new ArrayList<>(list));
        }
        dfs(root.left,targetSum-root.val,result,list);
        dfs(root.right,targetSum-root.val,result,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        dfs(root,targetSum,result,new ArrayList<>());
        return result;
    }
}