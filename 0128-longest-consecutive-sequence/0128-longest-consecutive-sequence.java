class Solution {
    public int longestConsecutive(int[] nums) {
       // Arrays.sort(nums);
        int maxi=1;
        int i=0,j=0,n=nums.length;
        if(n==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int x:nums)
            set.add(x);
        for(i=0;i<n;i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int cnt=1;
                int num=nums[i];
                while(set.contains(num+1))
                {
                    num++;
                    cnt++;
                }
                maxi=Math.max(maxi,cnt);
            }
        }
        return maxi;
    }
}