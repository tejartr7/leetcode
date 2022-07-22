/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return null;
        ListNode b=new ListNode(0);
        ListNode b1=b;
        ListNode a=new ListNode(0);
        ListNode a1=a;
        while(head!=null)
        {
            if(head.val<x)
            {
                b1.next=head;
                b1=b1.next;
            }
            else
            {
                a1.next=head;
                a1=a1.next;
            }
            head=head.next;
        }
        a1.next=null;
        b1.next=a.next;
        return b.next;
        
        
    }
}