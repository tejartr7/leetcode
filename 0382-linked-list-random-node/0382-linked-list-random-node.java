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
    ArrayList<Integer> list=new ArrayList<>();
    public Solution(ListNode head) {
        ListNode curr=head;
        while(curr!=null)
        {list.add(curr.val);
         curr=curr.next;
        }
    }
    
    public int getRandom() {
        int index = (int)(Math.random() *list.size());
        return list.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */