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
     public TreeNode a(int []nums,int start,int end)
     {
         if(start>end)
             return null;
         int mid=start+(end-start)/2;
         TreeNode k=new TreeNode(nums[mid]);
         k.left=a(nums,start,mid-1);
     k.right=a(nums,mid+1,end);
         return k;
     }
    public TreeNode sortedArrayToBST(int[] nums) {
       return a(nums,0,nums.length-1); 
    }
}