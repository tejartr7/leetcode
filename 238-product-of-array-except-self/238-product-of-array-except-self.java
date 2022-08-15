class Solution {
    public int[] productExceptSelf(int[] nums) {
       Map<Integer,Integer> a=new HashMap<>();
        int i;
        int l=nums.length;
        int pro=1;
        a.put(0,0);
        for(i=0;i<l;i++)
        {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
            if(nums[i]!=0)
                pro*=nums[i];
            
        }
        if(a.get(0)>1)
        {
            Arrays.fill(nums,0);
            return nums;
        }
        for(i=0;i<l;i++)
        {
            if(nums[i]!=0 && a.get(0)>0)
            {
                nums[i]=0;
            }
            else if(nums[i]==0 && a.get(0)==1)
            {
                nums[i]=pro;
            }
            else if(nums[i]!=0 && a.get(0)==0)
            {
              nums[i]=pro/nums[i];
            }
        }
        return nums;
    }
}