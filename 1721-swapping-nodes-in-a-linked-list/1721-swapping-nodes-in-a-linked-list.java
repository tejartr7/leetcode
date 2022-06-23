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
    public ListNode swapNodes(ListNode head, int k) {
     ListNode fast=head,slow=head,len=head;
        int size=0;
        if(head==null) return null;
/*----------------------------------------------------------------------------*/
        while(len!=null){ //measure length of linkedlist
            size++;
            len=len.next;
        }
/*----------------------------------------------------------------------------*/
        int n=size-k;
        for(int i=0;i<n;i++){ //to place pointer at kth node from the end
            fast=fast.next;
        }
/*----------------------------------------------------------------------------*/
        for(int i=1;i<k;i++){ //to place pointer at kth node from the start
            slow=slow.next;
        }
/*----------------------------------------------------------------------------*/
        int temp=fast.val;  //swapping values at respective nodes
        fast.val=slow.val;
        slow.val=temp;
        return head;
        }
    
}