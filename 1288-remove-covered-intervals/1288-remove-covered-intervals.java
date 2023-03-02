class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        int i,j=0,n=intervals.length;
        List<int[]>res=new ArrayList<>();
        res.add(intervals[0]);
        int count=0;
        for(i=1;i<n;i++)
        {
            int []x=res.get(j);
            if(intervals[i][0]<=x[1])
            {   
                if(x[1]>=intervals[i][1])
                    count++;
                x[1]=Math.max(x[1],intervals[i][1]);
                res.get(j)[1]=x[1];
            }
            else
            {   res.add(intervals[i]);
                j++;
            }
        } 
        return n-count;
    }
}