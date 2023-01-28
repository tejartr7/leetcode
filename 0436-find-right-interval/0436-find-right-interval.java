class Solution {
    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int i,n=intervals.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(i=0;i<n;i++)
        {
            map.put(intervals[i][0],i);
        }
       // System.out.println(map);
        for(i=0;i<n;i++)
        {
            int x=intervals[i][1];
            int y=map.ceilingKey(x)!=null?map.ceilingKey(x):Integer.MIN_VALUE;
           // System.out.println(y);
            if(y!=Integer.MIN_VALUE)
                ans[i]=map.get(y);
        }
        return ans;
    }
}