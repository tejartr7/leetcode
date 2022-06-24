/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      HashSet<ListNode> hs = new HashSet<>();
        while(head!=null){
            if(hs.contains(head)) break;
            hs.add(head);
            head = head.next;
        }
        if(head==null) return null;
        else return head;   
        
    }
}