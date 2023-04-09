class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int i,n=nums.length;
        int l=0,r=nums[n-1]-nums[0];
        while(l<r)
        {
            int mid=(l+r)/2;
            int count=0;
            for(i=1;i<n;i++)
            {
                if(nums[i]-nums[i-1]<=mid)
                {
                    count++;
                    i++;
                }
                if(count>=p)
                    break;
            }
            if(count>=p)
                r=mid;
            else l=mid+1;
        }
        return l;
    }
}