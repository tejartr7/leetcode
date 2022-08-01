class Solution {
    public int minOperations(int n) {
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            a[i]=2*i+1;
        int sum=0;
        int start=0;
        int end=n-1;
        while(start<end)
        {
            sum+=(a[end]-a[start])/2;
            end--;
            start++;
        }
        return sum;
        
    }
}