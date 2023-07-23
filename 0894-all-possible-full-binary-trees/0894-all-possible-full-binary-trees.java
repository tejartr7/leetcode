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
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode>ans=new ArrayList<>();
        //set=new HashMap<>();
        if(n==1)
        {
            TreeNode root=new TreeNode(0);
            ans.add(root);
            return ans;
        }
        if(n%2==0) return ans;
        int i;
        for(i=1;i<n;i+=2)
        {
            List<TreeNode> left=allPossibleFBT(i);
            List<TreeNode> right=allPossibleFBT(n-i-1);
            for(TreeNode l:left)
            {
                for(TreeNode r:right)
                {
                    TreeNode root=new TreeNode(0);
                    root.left=l;
                    root.right=r;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}