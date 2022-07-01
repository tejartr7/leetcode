class CustomStack {
    int a[];
    int count=0;
    int xa=0;
    public CustomStack(int maxSize) {
        a=new int[maxSize];
        xa=maxSize;
    }
    
    public void push(int x) {
        if(count<xa)
        {a[count]=x;
         count++;
        }
        
    }
    
    public int pop() {
        if(count>0)
        { count--;
            return a[count];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int i;
        if(k<=count){
        for(i=0;i<k;i++)
        {
            a[i]+=val;
        }
        }
        if(k>count)
        {
            for(i=0;i<count;i++)
        {
            a[i]+=val;
        }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */