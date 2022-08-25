class MyQueue {
   Stack<Integer> a;
    Stack<Integer> b;
    public MyQueue() {
        a=new Stack<>();
        b=new Stack<>();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        if(!b.isEmpty())
            return b.pop();
        while(!a.isEmpty())
        {
            b.add(a.pop());
        }
        return b.pop();
    }
    
    public int peek() {
          if(!b.isEmpty())
            return b.peek();
        while(!a.isEmpty())
        {
            b.add(a.pop());
        }
        return b.peek();
    }
    
    public boolean empty() {
        if(a.isEmpty() && b.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */