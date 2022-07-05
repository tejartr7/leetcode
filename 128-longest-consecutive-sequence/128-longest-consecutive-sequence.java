class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int curr=0;
        int i;
        int l=nums.length;
        Set<Integer>a=new HashSet<>();
        for(i=0;i<l;i++)
            a.add(nums[i]);
         for(int x:a)
         {
             if(!a.contains(x-1))
             {
                 int p=x;
                 int c=1;
                 while(a.contains(x+1))
                 {
                     c++;
                     x++;
                 }
                 max=Math.max(max,c);
             }
             
         }
        return max;
        
        
    }
}