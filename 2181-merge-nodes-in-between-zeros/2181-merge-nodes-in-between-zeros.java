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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head;
        ListNode n=head.next;
        while(n!=null)
        {
            if(n.val!=0 && n!=curr)
            {
                curr.val+=n.val;
            }
            else
            {
                curr.next=n.next;
                curr=curr.next;
                n=n.next;
            }
            if(n==null)
                break;
            n=n.next;
        }
        return head;
    }
}