class SeatManager {
    boolean a[];
    int size=-1;
    int min=0;
    public SeatManager(int n) {
       a=new boolean[n];
       size=n; 
    }
    public int reserve() {
        int i;
        for(i=min;i<size;i++)
        {
            if(a[i]==false)
            {   a[i]=true;
                min=i+1;
                return i+1;
            }
        }
        min++;
        return -1;      
    }
    
    public void unreserve(int seatNumber) {
       int x=seatNumber-1;
       if(a[x])
       {  
           min=Math.min(min,x);
           a[seatNumber-1]=false;
       }
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */