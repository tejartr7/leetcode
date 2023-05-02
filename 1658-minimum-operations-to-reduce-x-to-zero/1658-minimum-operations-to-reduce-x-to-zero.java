class Solution {
    public int lenOfLongSubarr (int a[], int n, long k) {
        //Complete the function
        Map<Long,Integer> map=new HashMap<>();
        map.put(0l,-1);
        int i=0,j=0;
        long sum=0;
        int ans=0;
        while(j<n)
        {
            sum+=a[j];
            if(map.containsKey(sum-k))
            {
                ans=Math.max(ans,j-map.get(sum-k));
            }
            if(!map.containsKey(sum))
            map.put(sum,j);
            j++;
        }
        //return ans;
        return ans;
    }
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int temp:nums)
            sum+=temp;
        if(sum==x)
            return nums.length;
        int temp=lenOfLongSubarr(nums,nums.length,sum-x);
        if(temp==0)
            return -1;
        return nums.length-temp;
    }
}