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
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;
        if(head==null || head.next==null)
            return head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        for(int i=0;i<list.size()-1;i++)
        {
            int x=list.get(i);
            int y=list.get(i+1);
            int z=gcd(x,y);
            temp.next=new ListNode(x);
            temp=temp.next;
            temp.next=new ListNode(z);
            temp=temp.next;
        }
        temp.next=new ListNode(list.get(list.size()-1));
        temp=temp.next;
        return ans.next;
    }
}