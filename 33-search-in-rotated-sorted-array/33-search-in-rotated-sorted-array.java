class Solution {
    public int search(int[] nums, int target) {
      //HashMap<Integer,Integer> a=new HashMap<>();
      
      int l=nums.length;
      for(int i=0;i<l;i++)
      {
          if(nums[i]==target)
              return i;
      }
        return -1;
       
    }
}