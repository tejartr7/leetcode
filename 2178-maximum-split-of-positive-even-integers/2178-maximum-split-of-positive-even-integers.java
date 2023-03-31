class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum%2==1) return new ArrayList<>();
        List<Long> ans=new ArrayList<>();
        long sum=0,val=2;
        while(val+sum<=finalSum)
        {
            ans.add(val);
            sum+=val;
            val+=2;
        }
        if(sum<finalSum)
        {
            long last=ans.remove(ans.size()-1);
            last+=finalSum-sum;
            ans.add(last);
        }
        return ans;
    }
}