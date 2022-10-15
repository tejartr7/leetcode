import java.util.PriorityQueue;

class SeatManager {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public SeatManager(int n) {
       for(int i=1;i<=n;i++)
           pq.add(i);
    }
    
    public int reserve() {
    return pq.poll(); 
    }
    
    public void unreserve(int seatNumber) {
      pq.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */