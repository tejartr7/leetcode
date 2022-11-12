import java.util.PriorityQueue;

class MedianFinder {
  PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());  
  PriorityQueue<Integer> min=new PriorityQueue<>();
  public MedianFinder() {
      
  }
  
  public void addNum(int num) {
      if(max.isEmpty()||max.peek()>=num)
      {
        max.add(num);
      }
      else
      {
        min.add(num);
      }
      if(max.size()>min.size()+1)
      {
        min.add(max.poll());
      }
      else if(min.size()>max.size())
      {
        max.add(min.poll());
      }
  }
  
  public double findMedian() {
      if(min.size()==max.size())
        return min.peek()/2.0+max.peek()/2.0;
        return max.peek()/1.0;

  }
}

/**
* Your MedianFinder object will be instantiated and called as such:
* MedianFinder obj = new MedianFinder();
* obj.addNum(num);
* double param_2 = obj.findMedian();
*/