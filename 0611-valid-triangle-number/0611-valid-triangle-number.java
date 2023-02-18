class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int i,n=nums.length;
        int count=0;
        for(i=n-1;i>=2;i--)
        {
            int l=0,h=i-1;
            while(l<h)
            {
                if(nums[l]+nums[h]>nums[i])
                {
                    count+=h-l;
                    h--;
                }
                else
                {
                    l++;
                }
            }
        }
        return count;
    }
}