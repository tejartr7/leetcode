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
    public int pairSum(ListNode head) {
     ArrayList<Integer> a=new ArrayList<>();
    while(head!=null)
    {
        a.add(head.val);
        head=head.next;
    }
        int sum=0;
        int l=a.size();
        int i=0;
        int j=l-1;
        while(i<j)
        {
            sum=Math.max(a.get(i)+a.get(j),sum);
            i++;
            j--;
        }
        return sum;
    }
}