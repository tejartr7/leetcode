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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode temp=null;
        ListNode prev=null;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a=reverseList(l1);
        ListNode b=reverseList(l2);
        ListNode head1=a,head2=b;
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        int carry=0;
        while(head1!=null || head2!=null || carry>0)
        {
            int sum=0;
            if(head1!=null)
            {sum+=head1.val;
            head1=head1.next;
            }
            if(head2!=null)
            {sum+=head2.val;
            head2=head2.next;
            }
            sum+=carry;
            carry=sum/10;
            sum%=10;
            ListNode dummy=new ListNode(sum);
            temp.next=dummy;
            temp=temp.next;
        }
        return reverseList(ans.next);
    }
}