class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        //List<int[]>res=new ArrayList<>();
        int j=0;
        int i;
        int n=intervals.length;
        int end=intervals[0][1];
        for(i=1;i<n;i++)
        {
            if(intervals[i][0]<end)
            {
                count++;
            }
            else
                end=intervals[i][1];
        }  
        return count;
    }
}