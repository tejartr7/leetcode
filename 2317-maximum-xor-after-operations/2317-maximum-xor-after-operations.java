class Solution {
    public boolean checkSetBit(int n,int i)
    {
        return (n>>i)%2==1;
    }
    public int maximumXOR(int[] nums) {
        int i,j,n=nums.length;
        int ans=0;
        for(i=0;i<32;i++)
        {
            for(j=0;j<n;j++)
            {
                if(checkSetBit(nums[j],i) && !checkSetBit(ans,i))
                {
                    ans|=nums[j];
                }
            }
        }
        return ans;
    }
}