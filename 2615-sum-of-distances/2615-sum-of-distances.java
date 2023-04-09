class Solution {
public long[] distance(int[] nums) {
        int i,n=nums.length;
        Map<Integer,Long> pre=new HashMap<>();
        Map<Integer,Long> suff=new HashMap<>();
        Map<Integer,Long> precount=new HashMap<>();
        Map<Integer,Long> suffcount=new HashMap<>();
        for(i=0;i<n;i++)
        {
            suff.put(nums[i],suff.getOrDefault(nums[i],0l)+i);
            precount.put(nums[i],0l);
            pre.put(nums[i],0l);
            suffcount.put(nums[i],suffcount.getOrDefault(nums[i],0l)+1l);
        }
         
        long ans[]=new long[n];
        for(i=0;i<n;i++)
        {
            long temp=suffcount.get(nums[i])+precount.get(nums[i]);
            //System.out.println(temp);
            if(temp==1l)
            {
                ans[i]=0;
            }
            else
            {
                long a=pre.get(nums[i]);
                long b=suff.get(nums[i]);
                long count1=precount.get(nums[i]);
                long count2=suffcount.get(nums[i]);
                long rtr=i*count1-a;
                long trt=b-count2*i;
               // System.out.println(rtr+" "+trt);
                ans[i]=Math.abs(rtr+trt);
                pre.put(nums[i],pre.get(nums[i])+i);
                precount.put(nums[i],precount.get(nums[i])+1);
                suff.put(nums[i],suff.get(nums[i])-i);
                suffcount.put(nums[i],suffcount.get(nums[i])-1);
            }
        }
    return ans;
}
}