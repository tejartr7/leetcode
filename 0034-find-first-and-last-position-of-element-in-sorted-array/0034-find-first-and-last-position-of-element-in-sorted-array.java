class Solution {
    public int[] searchRange(int[] nums, int target) {
       int k=nums.length;
        int []a=new int[2];
        Arrays.fill(a,-1);
        int i;
        if(k==0)
            return a;
       
            for(i=0;i<k;i++)
            {
                if(nums[i]==target)
                {a[0]=i;
                 break;}
            }
                 for(i=k-1;i>=0;i--)
            {
                if(nums[i]==target)
                {a[1]=i;
                 break;}
                
            }
                return a;
        
    }
}