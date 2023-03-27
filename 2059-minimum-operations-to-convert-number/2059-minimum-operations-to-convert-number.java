class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        q.offer(start);
        while(!q.isEmpty())
        {
            int i,n=q.size();
            for(i=0;i<n;i++)
            {
                int x=q.poll();
                if(x==goal) return count;
                if(x<0 || x>1000 || visited.contains(x)) continue;
                visited.add(x);
                for(int k=0;k<nums.length;k++)
                {
                    q.offer(nums[k]^x);
                    q.offer(x-nums[k]);
                    q.offer(x+nums[k]);
                }
            }
            count++;
        }
        return -1;
    }
}