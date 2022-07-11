class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a=new ArrayList<Integer>();
        int i;
        for(i=left;i<=right;i++)
        {
            int k=i;
            int count1=0;
            int count2=0;
           while(k>0)
           {
               int x=k%10;
               if(x!=0 && i%x==0)
               {
                   count1++;
               }
               count2++;
               k=k/10;
               
           }
            if(count1==count2)
                a.add(i);
        }
        return a;
    }
}