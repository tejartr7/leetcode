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
        if(head==null)
            return null;
     ListNode odd=head;
          ListNode eve=head.next;
          ListNode link=eve;
        while(eve!=null && eve.next!=null)
        {
            odd.next=eve.next;
            odd=odd.next;
            eve.next=odd.next;
            eve=eve.next;
        }
        odd.next=link;
        return head;
        
    }
}