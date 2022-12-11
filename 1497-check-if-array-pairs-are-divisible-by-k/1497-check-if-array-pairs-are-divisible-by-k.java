class Solution {
    public boolean canArrange(int[] nums, int k) {
        int a[]=new int[k];
        int i;
        for(int x:nums)
        {
            a[(x%k+k)%k]++;
        }
        if(a[0]%2==1)
            return false;
        if(k%2==0)
        {
            if((a[k/2]&1)==1)
                return false;
        }
        for(i=1;i<=k/2;i++)
        {
            if(a[i]!=a[k-i])
                return false;
        }
        return true;
    }
}