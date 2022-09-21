class MyCircularQueue {
    int size, front =-1, rear =-1;
    int arr[];
    
    public MyCircularQueue(int k) {
       arr= new int[k];
       this.size = k;
    }
        
    public boolean enQueue(int value) {
        if(isFull())  return false;
        rear = (rear+1)%size;
        if(front == -1)   front =0;
        arr[rear]= value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())   return false;
       if(front== rear)
           front = rear = -1;
       else
           front = (front+1)%size;
        return true;
    }
    
    public int Front() {
     if(front==-1)    return -1;
      return arr[front];
    }
    
    public int Rear() {
      if(rear==-1)   return -1;
       return arr[rear];
    }
    
    public boolean isEmpty() {
       return front == -1 && rear == -1;
    }    
    public boolean isFull() {
         return (rear + 1) % size == front;
    }
}