class Solution {
    List<List<Integer>> list=new ArrayList<>();
    void backTrack(int c[],int k,int index,int sum,ArrayList<Integer> l)
    {
        if(sum<0)
        return ;
        if(sum==0)
        {
            if(l.size()==k)
            list.add(new ArrayList<>(l));
            return ;
        }
        for(int i=index;i<c.length;i++)
        {  
              l.add(c[i]);
             // System.out.println(list);
              backTrack(c,k,i+1,sum-c[i],l);
              l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int c[]={1,2,3,4,5,6,7,8,9};
        backTrack(c,k,0,n,new ArrayList<>());
        return list;
    }
}