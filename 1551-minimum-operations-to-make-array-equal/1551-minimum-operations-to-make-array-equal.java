class Solution {
    public int minOperations(int n) {
      
        int sum=0;
        int start=0;
        int end=n-1;
        while(start<end)
        {
            sum+=end-start;
            end--;
            start++;
        }
        return sum;
        
    }
}