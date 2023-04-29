class Solution {
    public int search(int target,List<Integer> list)
    {
        int l=0,h=list.size();
        while(l<h)
        {
            int mid=(l+h)/2;
            if(list.get(mid)>=target)
                h=mid;
            else 
                l=mid+1;
        }
        return l;
    }
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        int i,j,n=rectangles.length,m=points.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            int a=rectangles[i][0];
            int b=rectangles[i][1];
            if(!map.containsKey(b))
                map.put(b,new ArrayList<>());
            map.get(b).add(a);
        }
        for(int x:map.keySet())
        {
            List<Integer> temp=map.get(x);
            Collections.sort(temp);
            map.put(x,temp);
        }
        int ans[]=new int[m];
        for(i=0;i<m;i++)
        {
            int x=points[i][0];
            int y=points[i][1];
            int count=0;
            for(j=y;j<=100;j++)
            {
                List<Integer> list=new ArrayList<>();
                if(map.containsKey(j))
                    list=map.get(j);
                if(list.size()>0)
                {
                    int index=search(x,list);
                    count+=list.size()-index;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}