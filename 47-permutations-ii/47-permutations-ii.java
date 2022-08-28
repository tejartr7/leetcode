class Solution {
    void swap(int []a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    void getper(int []a,int index,List<List<Integer>> res)
    {
        if(index>=a.length)
        {
            List<Integer> ans=new ArrayList<>();
            int j;
            for(j=0;j<a.length;j++)
                ans.add(a[j]);
            if(!res.contains(ans))
            res.add(ans);
        }
        else
        {
            for(int i=index;i<a.length;i++)
            {
                swap(a,i,index);
                getper(a,index+1,res);
                swap(a,i,index);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        getper(nums,0,res);
        return res;
    }
}