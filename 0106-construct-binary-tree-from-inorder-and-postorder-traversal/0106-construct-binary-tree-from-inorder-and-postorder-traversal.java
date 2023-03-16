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
    public TreeNode builder(int []o,int os,int oe,int []p,int ps,int pe,Map<Integer,Integer> map)
    {
        if(ps>pe|| os>oe)
        return null;
        TreeNode root=new TreeNode(p[pe]);
        int index=map.get(p[pe]);
        root.right=builder(o,index+1,oe,p,ps-os+index,pe-1,map);
        root.left=builder(o,os,index-1,p,ps,ps-os+index-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        int i,n=inorder.length;
        for(i=0;i<n;i++)
        map.put(inorder[i],i);
        int j=n-1;
        return builder(inorder,0,n-1,postorder,0,n-1,map);
    }
}