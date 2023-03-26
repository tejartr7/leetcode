class Solution {
    //int curr=0;
    public boolean helper(int nums[],int curr,int i,int sum,int k)
    {
        if(k==0)
        return true;
        if(sum==curr)
        {
            return helper(nums,curr,0,0,k-1);
        }
        int j,n=nums.length;
        for(j=i;j<n;j++)
        {
            if(nums[j]<0 || nums[j]+sum>curr)
            continue;
            int x=nums[j];
            nums[j]=-1;
            if(helper(nums,curr,j+1,sum+x,k))
            return true;
            nums[j]=x;
        }
        return false;
    } 
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        int i;
        int n=nums.length;
        if(n==1 || k==1)
        return true;
        for(i=0;i<n;i++)
            sum+=nums[i];
        if(sum%k!=0)
           return false;
        int curr=sum/k;
        //Arrays.sort(nums);
        return helper(nums,curr,0,0,k);
    }
}