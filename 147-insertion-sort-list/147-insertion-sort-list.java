
class Solution {
    private ListNode getmid(ListNode head)
    {
        ListNode mid=null;
        while(head!=null && head.next!=null)
        {
            mid=(mid==null)?head:mid.next;
            head=head.next.next;
        }
        ListNode midd=mid.next;
        mid.next=null;
        return midd;
    }
    private ListNode merge(ListNode a,ListNode b)
    {
        ListNode k=new ListNode(-1);
        ListNode temp=k;
        while(a!=null && b!=null)
        {
            if(a.val<b.val)
            {
                temp.next=a;
                a=a.next;
                temp=temp.next;
                
            }
            else
            {
                temp.next=b;
                b=b.next;
                temp=temp.next;
            }
        }
        temp.next=(a!=null)?a:b;
        return k.next;
    }
    
    public ListNode insertionSortList(ListNode head) {
        if(head==null ||head.next==null)
            return head;
       ListNode mid=getmid(head);
        ListNode left=insertionSortList(head);
        ListNode right=insertionSortList(mid);
        return merge(left,right);
    }
}