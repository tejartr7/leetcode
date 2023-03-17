class Solution {
    public void rotate(int[] nums, int k) {
        int i,n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            map.put(i,nums[i]);
        }
        k%=n;
        for(i=0;i<n;i++)
        {
            nums[i]=map.get((n-k+i)%n);
        }
    }
}