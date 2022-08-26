class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>res=new ArrayList<>();
        int j=0;
        int i;
        int n=intervals.length;
        res.add(intervals[0]);
        for(i=1;i<n;i++)
        {
            int []x=res.get(j);
            if(intervals[i][0]<=x[1])
            {
                x[1]=Math.max(x[1],intervals[i][1]);
            }
            else
            {   res.add(intervals[i]);
                j++;
            }
        }
        int [][]ans=new int[j+1][2];
        for(i=0;i<=j;i++)
            ans[i]=res.get(i);
        return ans;
    }
}