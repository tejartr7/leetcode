class SmallestInfiniteSet {
    boolean a[]=new boolean[1001];
    
    public SmallestInfiniteSet() {
        Arrays.fill(a,true);
    }
    
    public int popSmallest() {
        int i;
        for(i=0;i<1001;i++)
        {
            if(a[i]==true)
            {
                a[i]=false;
                return i+1;
            }
        }
        return -1;
    }
    
    public void addBack(int num) {
        a[num-1]=true;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */