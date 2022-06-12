class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int l=arr.length;
        int i;
        int sum=0;
        int max=-1111110;
        for(i=0;i<l;i++)
        {
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0)
            sum=0;
        }
        return (long)max;
        
    }
    
}
