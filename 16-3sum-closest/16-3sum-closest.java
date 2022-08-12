class Solution {
    public int threeSumClosest(int[] nums, int target) {
    int close=1000000;
        int i;
        int l=nums.length;
        Arrays.sort(nums);
        for(i=0;i<l-2;i++)
        {
            int j=i+1;
            int k=l-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
              
                if(sum<target)
                    j++;
                else
                    k--;
                if(Math.abs(target-sum)<Math.abs(close-target))
                    close=sum;
            }
        }
return close;
    }
}