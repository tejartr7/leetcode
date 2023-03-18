class Solution {
    public int maximumTop(int[] nums, int k) {
        int maxi=0;
        int i,n=nums.length;
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        boolean flag=false;
        if(n==1) return k%2==0?nums[0]:-1;
        for(i=0;i<Math.min(n,k-1);i++)
        {
            maxi=Math.max(maxi,nums[i]);   
        }
        if(k<n)
            maxi=Math.max(maxi,nums[k]);
        return maxi;
    }
}