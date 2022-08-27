class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
     
        res.add(new ArrayList<>());
        int []a=new int[n];
        int i;
        for(i=0;i<n;i++)
            a[i]=i+1;
        
        int j;
        for(i=0;i<n;i++)
        {
            int l=res.size();
            for(j=0;j<l;j++)
            {
                List temp=new ArrayList(res.get(j));
                temp.add(a[i]);
               res.add(temp);
            }
        }
        for(i=0;i<res.size();i++)
        {
            List<Integer> temp=new ArrayList(res.get(i));
            if(temp.size()==k)
                result.add(temp);
        }
       return result;
        
    }
}