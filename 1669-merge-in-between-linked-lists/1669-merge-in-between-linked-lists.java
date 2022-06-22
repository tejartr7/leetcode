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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
         ListNode p=list1;
         ListNode q=list1;
         int i,j;
        for(i=0;i<a-1;i++)
        {
            p=p.next;
        }
      for(i=0;i<b+1;i++)
      {
         q=q.next; 
      }
        p.next=list2;
        ListNode r=list2;
        while(r.next!=null)
        {
            r=r.next;
        }
        r.next=q;
        return list1;
    
    }
}