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
    public int[] nextLargerNodes(ListNode head) {
        int max=0;
        int l=0;
        ListNode k=head;
        while(k!=null)
        {
            l++;
          k=k.next;
        }
        int []a=new int[l];
        int []b=new int[l];
        int s=0;
        Arrays.fill(b,0);
        int i;
        for(i=0;i<l;i++)
        {
            a[i]=head.val;
            head=head.next;
        }
        int j;
        for(i=0;i<l;i++)
        { max=a[i];
            for(j=i+1;j<l;j++)
            {
                if(a[j]>a[i])
                {
                    b[i]=a[j];
                    
                    break;
                }
               
            }
            
        }
        b[l-1]=0;
        return b;
    }
}