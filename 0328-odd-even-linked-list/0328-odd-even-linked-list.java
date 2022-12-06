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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode odd=head;
        ListNode head2=head.next;
        ListNode even=head2;
        while(even!=null && odd!=null)
        {   if(even==null)
            break;
            odd.next=even.next;
            odd=odd.next;
            if(odd==null)
            break;
            even.next=odd.next;
            even=even.next;
        }
        odd=head;
        while(odd.next!=null)
            odd=odd.next;
        odd.next=head2;
        return head;
    }
}