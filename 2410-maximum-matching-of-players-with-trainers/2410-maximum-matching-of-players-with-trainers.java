class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        Scanner s=new Scanner(System.in);
        int i,j,n1=p.length,n2=t.length;
        int y=0,count=0;
        for(i=0;i<n1;i++)
        {
            if(y>=n2)
                return count;
            while(y <n2 && t[y]<p[i])
             {y++;}
            if(y<n2 && t[y]>=p[i])
            {count++;
            y++;}
        }
        return count;
    }
}