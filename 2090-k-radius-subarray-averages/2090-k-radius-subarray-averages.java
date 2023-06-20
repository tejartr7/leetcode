class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        int i,j=0;
        long sum=0;
        if(k==0)
            return nums;
        if(2*k+1>n) return ans;
        for(i=0;i<n;i++){
            sum+=nums[i];
            if(i-j+1>=2*k+1)
            {
                ans[k+j]=(int)(sum/(long)(2*k+1));
                sum-=nums[j++];
            }
        }
        return ans;
    }
}