class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int amin=0,amax=a.length-1,bmin=0,bmax=a[0].length-1;
        List<Integer> list=new ArrayList<>();  
        boolean visited[][]=new boolean[amax+1][bmax+1];
        while(amin<=amax && bmin<=bmax)
        {
            int i,j;
            i=amin;
            for(j=bmin;j<=bmax;j++)
            {   if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            amin++;
            j=bmax;
            for(i=amin;i<=amax;i++)
            {
               if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            bmax--;
            i=amax;
            for(j=bmax;j>=bmin;j--)
            {
                if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            amax--;
            j=bmin;
            for(i=amax;i>=amin;i--)
            {
                if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            bmin++;
        }
        return list;   
    }
}