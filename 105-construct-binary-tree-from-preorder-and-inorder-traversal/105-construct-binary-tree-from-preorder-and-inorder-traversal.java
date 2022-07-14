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
    HashMap<Integer,Integer> a;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0;
        a=new HashMap<>();
        int i;
        int l=inorder.length;
        for(i=0;i<l;i++)
        {
            a.put(inorder[i],i);
        }
        return fun(preorder,0,preorder.length-1);
        
        
    }
    public TreeNode fun(int []preorder,int l,int r)
    {
        if(l>r)
            return null;
        int val=preorder[index];
        index++;
        TreeNode root=new TreeNode(val);
        root.left=fun(preorder,l,a.get(val)-1);
        root.right=fun(preorder,a.get(val)+1,r);
        return root;
    }
}