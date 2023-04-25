class Solution {
    public boolean checkSetBit(int n,int i)
    {
        return (n>>i)%2==1;
    }
    public int minimizeXor(int nums1, int nums2) {
        int ans=0;
        int k=Integer.bitCount(nums2);
        for(int i=31;i>=0;i--)
        {
            if(checkSetBit(nums1,i))
            {
                ans|=(1<<i);
                k--;
                if(k==0)
                    break;
            }
        }
        if(k>0)
        {
            for(int i=0;i<32;i++)
            {
                if(!checkSetBit(nums1,i))
                {
                    ans|=(1<<i);
                    k--;
                    if(k==0)
                        break;
                }
            }
        }
        return ans;
    }
}