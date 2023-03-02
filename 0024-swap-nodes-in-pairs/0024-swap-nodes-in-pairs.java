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
    //public ListNode
    public ListNode swapPairs(ListNode head) {
        //List<ListNode> list=new ArrayList<>();
        if(head==null || head.next==null)
            return head;
        ListNode prev=head,curr=head.next;
        ListNode next=head.next;
        head.next=swapPairs(head.next.next);
        next.next=head;
        return next;
    }
}