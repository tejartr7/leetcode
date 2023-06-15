class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 1;
        
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxi = Integer.MIN_VALUE;
        int cnt = 0;
        
        while (!q.isEmpty()) {
            int sum = 0;
            cnt++;
            int n = q.size();
            
            for (int i = 0; i < n; i++) {
                TreeNode top = q.poll();
                sum += top.val;
                
                if (top.left != null)
                    q.offer(top.left);
                if (top.right != null)
                    q.offer(top.right);
            }
            
            if (sum > maxi) {
                ans = cnt;
                maxi = sum;
            }
        }
        
        return ans;
    }
}
