class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int sum=0;
        int i;
        if(l%2==1)
        {
            int k=nums[l/2];
            for(i=0;i<l;i++)
            {
                sum+=Math.abs(k-nums[i]);
            }
            return sum;
        }
        
        int m=nums[l/2]+nums[(l-2)/2];
        int k=(int)Math.ceil(m/2);
        for(i=0;i<l;i++)
        {
            sum+=Math.abs(k-nums[i]);
        }
        return sum;
    }
}