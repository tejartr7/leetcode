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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
  int l=0;
        ListNode s=head;
        while(s!=null)
        {
            l++;
            s=s.next;
        }
        int r=l+1-n;
        if(r==1)
            return head.next;
        int i=0;
        ListNode temp=head;
        while(temp!=null)
        {
            i++;
            if(i==r-1)
            {
                temp.next=temp.next.next;
            }
            
            temp=temp.next;
        }
        return head;
    }
}