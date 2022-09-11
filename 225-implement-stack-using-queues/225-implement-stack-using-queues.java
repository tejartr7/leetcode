class MyStack {
    Queue<Integer> a=new LinkedList<>();
    Queue<Integer> b=new LinkedList<>();
    int top=0;
    public MyStack() {
        
    }
    
    public void push(int x) {
        a.add(x);
        top=x;
    }
    
    public int pop() {
      while(a.size()>1)
      {
          top=a.remove();
          b.add(top);
          
      }
        int x=a.peek();
        a.remove();
        Queue<Integer> temp=a;
        a=b;
        b=temp;
        return x;
    }
    
    public int top() {
      
        return top;
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */