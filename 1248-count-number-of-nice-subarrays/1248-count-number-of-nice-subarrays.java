class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0;
        int count=0,oddCount=0;
        int i,j,n=nums.length;
        for(i=0;i<n;i++)
        {
            nums[i]=nums[i]%2;
        }
        i=0;j=0;
        while(j<n)
        {
            if(nums[j]%2==1) 
            {
                oddCount++;
                count=0;
            }
            while(oddCount==k)
            {
                count++;
                if(nums[i]==1)
                    oddCount--;
                i++;
            }
            ans+=count;
            j++;
        }
        return ans;
    }
}