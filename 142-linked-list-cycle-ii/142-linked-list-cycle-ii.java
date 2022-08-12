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
        Set<ListNode> vals=new HashSet<>();
        while(head!=null)
        { if(vals.contains(head))
            break;
            vals.add(head);
            head=head.next;
        }
        return head;
        
    }
}