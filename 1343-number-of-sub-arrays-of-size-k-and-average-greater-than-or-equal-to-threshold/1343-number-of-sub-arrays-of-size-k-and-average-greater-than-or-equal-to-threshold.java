class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,count=0;
        int i=0,j=0;
        int n=arr.length;
        while(j<n)
        {
            sum+=arr[j];
            if(j-i+1==k)
            {
                if(sum/k>=threshold)
                    count++;
                sum-=arr[i++];
            }
            j++;
        }
        return count;
    }
}