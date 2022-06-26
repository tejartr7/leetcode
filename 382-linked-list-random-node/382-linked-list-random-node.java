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
ArrayList<Integer> a=new ArrayList<>();
    public Solution(ListNode head) {
        while(head!=null)
        {
            a.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
        int x=(int)(Math.random()*a.size());
        return a.get(x);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */