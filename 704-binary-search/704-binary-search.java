class Solution {
    public int search(int[] nums, int target) {
      int i,k;
        int l=nums.length;
        int index=-1;
        int mid;
        int first=0;
        int last=l-1;
        while(first<=last){
            mid=first+(last-first)/2;
              if(nums[mid]==target)
            {
                index=mid;
                break;
            }
           else if(nums[mid]>target)
            {
                last=mid-1;
                
            }
            else if(nums[mid]<target)
            {
                first=mid+1;
            }
          
            
        }
        return index;
    }
}