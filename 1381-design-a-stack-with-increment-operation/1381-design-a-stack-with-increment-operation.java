public class CustomStack {
    int a[];
    int count=0;
    int  size=0;
    public CustomStack(int maxSize) {
        a=new int[maxSize];
        size=maxSize;
    }
    
    public void push(int x) {
        if(count<size)
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

