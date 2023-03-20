class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int count=0;
        int i,l=f.length;
        List<Integer> list=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        for(i=0;i<l;i++)
        {
           if(f[i]==1)
           {
               list.add(i);
               if(i-1>=0)
                  list.add(i-1);
               if(i+1<l)
                  list.add(i+1);
           }
        }
        for(i=0;i<l;i++)
        {
            if(!list.contains(i))
            {
                if(curr.isEmpty())
                    curr.add(i);
                else if(curr.get(curr.size()-1)<i-1)
                    curr.add(i);
            }
        }
        return curr.size()>=n;
    }
}