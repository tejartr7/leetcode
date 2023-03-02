class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=0,h=0;
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            h=Math.max(h,nums[i]);
        }
        //System.out.println(h);
        while(l<h)
        {
            int count=0;
            int mid=l+(h-l)/2;
            if(mid==0)
                break;
            for(i=0;i<n;i++)
            {
                int x=nums[i]/mid;
                count+=x;
                if(nums[i]%mid>0)
                    count++;
            }
            //System.out.println(mid+" "+count);
            if(count<=threshold)
            {
                h=mid;
            }
            else
                l=mid+1;
        }
        return l==0?1:l;
    }
}