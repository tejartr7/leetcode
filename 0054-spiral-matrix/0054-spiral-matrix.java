class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int amin=0,amax=a.length-1,bmin=0,bmax=a[0].length-1;
        int r=a.length,l=a[0].length;
        List<Integer> list=new ArrayList<>();    
        while(amin<=amax && bmin<=bmax)
        {
            int i,j;
            i=amin;
            for(j=bmin;j<=bmax;j++)
            {
                list.add(a[i][j]);
            }
            amin++;
            j=bmax;
            if(list.size()==r*l)
                return list;
            for(i=amin;i<=amax;i++)
            {
                list.add(a[i][j]);
            }
            if(list.size()==r*l)
                return list;
            bmax--;
            i=amax;
            for(j=bmax;j>=bmin;j--)
            {
                list.add(a[i][j]);
            }
            if(list.size()==r*l)
                return list;
            amax--;
            j=bmin;
            for(i=amax;i>=amin;i--)
            {
                list.add(a[i][j]);
            }
            if(list.size()==r*l)
                return list;
            bmin++;
        }
        return list;   
    }
}