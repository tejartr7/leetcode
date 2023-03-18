class Solution {
    public int maximumTop(int[] nums, int k) {
        int maxi=0;
        int i,n=nums.length;
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        boolean flag=false;
        if(n==1 && k%2==1) return -1;
        else if(n==1 && k%2==0) return nums[0];
        for(i=0;i<n;i++)
        {
            if(k-i-1>0)
            {
                visited[i]=true;
                flag=true;
            }
            else if(k==i && k!=n)
            {
                visited[i]=true;
                flag=true;
            }
        }
        for(i=0;i<n;i++)
        {
            if(visited[i])
            {
                maxi=Math.max(maxi,nums[i]);
            }
        }
        return flag?maxi:-1;
    }
}