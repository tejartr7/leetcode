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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
         ListNode curr=head;
         int count=0;
         while(curr!=null)
         {
             count++;
             curr=curr.next;
         }
         int a[]=new int[count];
         curr=head;
         int x=0,i;
         while(curr!=null)
         {
             a[x]=curr.val;
             curr=curr.next;
             x++;
         }
        Map<Integer,Integer> ans=new HashMap<>();
        int n=count;
        for(i=0;i<n;i++)
        {
            ans.put(i,a[i]);
        }
        if(k>count)
        {
            k%=count;
        }
        for(i=0;i<n;i++)
        {
            a[i]=ans.remove((i-k+count)%count);
        }
       
        ListNode temp=new ListNode(0);
        ListNode dummy=temp;
        for(i=0;i<n;i++)
        {
            dummy.next=new ListNode(a[i]);
            dummy=dummy.next;
        }
        return temp.next;
    }
}