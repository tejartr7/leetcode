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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.next!=null)
            {
                if(temp.next.val==temp.val)
                {
                    temp.next=temp.next.next;
                    continue;
                }
            }
            else
            {
                temp.next=null;
            }
            temp=temp.next;  
        }
        return head;
    }
}