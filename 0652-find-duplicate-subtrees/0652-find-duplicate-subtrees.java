class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new LinkedList<>();
        traverse(root, new HashMap<>(), new HashMap<>(), res);
        return res;
    }

    public int traverse(TreeNode node, Map<String, Integer> tripletToID,
            Map<Integer, Integer> cnt, List<TreeNode> res) {
        if(node==null) return 0;
        String temp=traverse(node.left,tripletToID,cnt,res)+","+node.val+","+
        traverse(node.right,tripletToID,cnt,res);
        if(!tripletToID.containsKey(temp))
        {
            tripletToID.put(temp,tripletToID.size()+1);
        }
        int x=tripletToID.get(temp);
        cnt.put(x,cnt.getOrDefault(x,0)+1);
        if(cnt.get(x)==2)
        {
            res.add(node);
        }
        return x;
    }
}