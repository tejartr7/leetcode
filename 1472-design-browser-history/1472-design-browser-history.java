class Node
{
    String data;
    Node next=null;
    Node prev=null;
    Node(String x)
    {
        this.data=x;
    }
}


class BrowserHistory {
    Node curr=null;
    Node previ=null;
    public BrowserHistory(String homepage) {
        Node n=new Node(homepage);
        curr=n;
    }
    
    public void visit(String url) {
        Node n=new Node(url);
        previ=curr;
        curr=n;
        previ.next=curr;
        curr.prev=previ;
    }
    
    public String back(int steps) {
        while(curr.prev!=null)
        {
            curr=curr.prev;
            steps--;
            if(steps==0)
            break;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while(curr.next!=null)
        {
            curr=curr.next;
            steps--;
            if(steps==0)
            break;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */