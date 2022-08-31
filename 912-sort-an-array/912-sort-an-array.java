class Solution {
    public int[] sortArray(int[] nums) {
        
         int []temp=new int[nums.length];
         mergesort(nums,0,nums.length-1,temp);
         return nums;
    }
  void mergesort(int []nums,int start,int end,int []temp)
  {
        if(start<end)
        {
            int mid=start+(end-start)/2;
            mergesort(nums,start,mid,temp);
            mergesort(nums,mid+1,end,temp);
            merge(nums,start,mid,end,temp);
        }
  }
  void merge(int []nums,int start,int mid,int end,int []temp)
  {
      int i;
      for(i=start;i<=end;i++)
          temp[i]=nums[i];
      i=start;
      int j=mid+1;
      int k=start;
      while(i<=mid && j<=end)
      {
          if(temp[i]<=temp[j])
              nums[k++]=temp[i++];
          else
              nums[k++]=temp[j++];
      }
      while(i<=mid)
      {
         nums[k++]=temp[i++]; 
          }
      while(j<=end)
          nums[k++]=temp[j++];
  }
    
}