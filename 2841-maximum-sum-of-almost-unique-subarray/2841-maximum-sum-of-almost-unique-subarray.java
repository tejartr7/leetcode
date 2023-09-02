class Solution {
    public long maxSum(List<Integer> num, int m, int k) {
        long ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        int nums[]=new int[num.size()];
        int i,j,n=num.size();
        for(i=0;i<n;i++)
            nums[i]=num.get(i);
        i=0;
        j=0;
        long sum=0;
        int cnt=0;
        while(j<nums.length)
        {
            sum+=nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])==1)
                cnt++;
            if(j-i+1>k)
            {
                sum-=nums[i];
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0)
                {map.remove(nums[i]);
                 cnt--;
                }
                i++;
            }
            if(j-i+1==k)
            {
                if(cnt>=m)
                    ans=Math.max(ans,sum);
            }
            j++;
        }
        return ans;
    }
}