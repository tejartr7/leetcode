class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length,index=0,i;
        Deque<Integer> q=new ArrayDeque<>();
        int max[]=new int[n-k+1];
        for(i=0;i<n;i++)
        {
            while(!q.isEmpty() && q.peek()<i-k+1)
            {
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
            {
                q.pollLast();
            }
            q.offerLast(i);
            if(i>=k-1)
            {
                max[index++]=nums[q.peek()];
            }
        }
        return max;
    }
}