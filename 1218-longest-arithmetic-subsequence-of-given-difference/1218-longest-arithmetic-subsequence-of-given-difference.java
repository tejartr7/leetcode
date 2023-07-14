class Solution {
    public int longestSubsequence(int[] arr, int d) {
        Map<Integer,Integer> map=new HashMap<>();
        int i,n=arr.length;
        int maxi=0;
        for(i=0;i<n;i++)
        {
            int cnt=map.getOrDefault(arr[i]-d,0);
            map.put(arr[i],cnt+1);
            maxi=Math.max(maxi,cnt+1);
        }
        return maxi;
    }
}