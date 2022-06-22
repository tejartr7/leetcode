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
    public ListNode middleNode(ListNode head) {
        ListNode[] k=new ListNode[100];
        int t=0;
        while(head!=null)
        {
            k[t]=head;
            head=head.next;
            t++;
        }
        return k[t/2];
    }
}