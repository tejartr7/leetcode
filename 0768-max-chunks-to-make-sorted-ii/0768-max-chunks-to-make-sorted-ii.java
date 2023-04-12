class Solution {
    
    public int maxChunksToSorted(int[] arr) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        int i,n=arr.length;
        int brr[]=new int[n];
        for(i=0;i<n;i++)
            brr[i]=arr[i];
        Arrays.sort(brr);
        int sum1=0;
        int sum2=0;
        for(i=0;i<n;i++)
        {
            sum1+=arr[i];
            sum2+=brr[i];
            if(sum1==sum2)
                count++;
        }
        return count;
    }
}