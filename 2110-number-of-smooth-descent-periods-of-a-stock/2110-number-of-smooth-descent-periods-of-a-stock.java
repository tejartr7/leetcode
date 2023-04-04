class Solution {
    public long getDescentPeriods(int[] nums) {
        long ans=0;
        int i=0,j=0,n=nums.length;
        while(j<n)
        {
            if(j-i!=nums[i]-nums[j])
            {
                long x=(long)(j-i)*(long)(j-i+1);
                x/=2;
                ans+=x;
                i=j;
            }
            j++;
        }
        ans+=((long)(j-i)*(long)(j-i+1))/2;
        //System.out.println(ans);
        return ans;
    }
}