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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        ListNode curr = new ListNode(-1);
        ListNode temp = curr;
        int c = 0;
        while (head1 != null && head2 != null) {
            int sum = c + head1.val+ head2.val;
            c = sum / 10;
            ListNode dummy = new ListNode(sum % 10);
            temp.next = dummy;
            temp = dummy;
            head1 = head1.next;
            head2 = head2.next;
        }
        while (head1 != null) {
            int sum = c + head1.val;
            c = sum / 10;
            ListNode dummy = new ListNode(sum % 10);
            temp.next = dummy;
            temp = dummy;
            head1 = head1.next;
        }
        while (head2 != null) {
            int sum = c + head2.val;
            c = sum / 10;
            ListNode dummy = new ListNode(sum % 10);
            temp.next = dummy;
            temp = dummy;
            head2 = head2.next;
        }
        if (c > 0) {
            ListNode dummy = new ListNode(c);
            temp.next = dummy;
            temp = dummy;
        }
        return curr.next;
    }
}