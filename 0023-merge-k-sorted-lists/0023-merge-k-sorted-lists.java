
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       if (lists==null || lists.length==0) return null;
        
        PriorityQueue<ListNode> q= new PriorityQueue<ListNode>(lists.length, (a,b)-> a.val-b.val);
        ListNode node=new ListNode(-1);
        ListNode tail=node;
        for(ListNode l:lists)
        {
            if(l!=null)
                q.offer(l);
        }
        while(!q.isEmpty())
        {
            tail.next=q.poll();
            tail=tail.next;
            if(tail.next!=null)
                q.offer(tail.next);
        }
        return node.next;
    }
}