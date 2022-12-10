class Solution {
    int MOD = (int)(1e9 + 7);
     int nodesSum;
     long ans;
     public int maxProduct(TreeNode root) {
         nodesSum = sum(root); 
         ans = 0l;
         MaxProduct(root);
         return (int)(ans % MOD);
     }
     public int sum(TreeNode node){
         if(node == null) return 0;
         return sum(node.left) + sum(node.right) + node.val;
     }
     public int MaxProduct(TreeNode node){
         if(node == null) return 0;
         int substree1Sum = MaxProduct(node.left) + MaxProduct(node.right)+ node.val;
         int substree2Sum = nodesSum - substree1Sum;
         ans = Math.max(ans, (long)substree1Sum * substree2Sum);
         return substree1Sum;
     }
 }