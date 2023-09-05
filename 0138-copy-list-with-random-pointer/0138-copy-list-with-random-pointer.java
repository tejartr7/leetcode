/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node ans=new Node(-1);
        Node curr=ans;
        Node temp=head;
        HashMap<Node,Node> map=new HashMap<>();
        while(temp!=null)
        {
            Node n=new Node(temp.val);
            curr.next=n;
            curr=curr.next;
            map.put(temp,curr);
            temp=temp.next;
        }
        temp=head;
        curr=ans.next;
        while(temp!=null)
        {
            curr.random=map.get(temp.random);
            temp=temp.next;
            curr=curr.next;
        }
        return ans.next;
    }
}