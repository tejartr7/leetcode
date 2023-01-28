class SummaryRanges {
    TreeSet<Integer> set=new TreeSet<>();
    public SummaryRanges() {
        
    }
    
    public void addNum(int value) {
        set.add(value);
    }
    
    public int[][] getIntervals() {
        List<int[]> list=new ArrayList<>();
        if(set.size()==0)
            return new int[0][2];
        int left=-1,right=-1;
        for(int x:set)
        {
            if(left<0)
            {
                left=x;
                right=x;
            }
            else if(right==x-1)
            {
            right=x;
            }
            else
            {
                list.add(new int[]{left,right});
                right=left=x;
            }
        }
        list.add(new int[]{left,right});
        int ans[][]=new int[list.size()][2];
        int i=0;
        for(int x[]:list)
        {
            ans[i++]=x;
        }
        return ans;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */