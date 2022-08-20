class Solution {
    public void rotate(int[] nums, int k) {
        int i;
       
        int n=nums.length;
        if(k>n)
            k%=n;
        Map<Integer,Integer> map=new HashMap();
        for(i=0;i<n;i++)
            map.put(i,nums[i]);
        for(i=0;i<n;i++)
            nums[i]=map.remove((n-k+i)%n);
    }
}