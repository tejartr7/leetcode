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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
         int a[][]=new int[m][n];
         int amin=0,amax=m-1,bmin=0,bmax=n-1;
         int x,y;
        for(int rows[]:a)
        {
            Arrays.fill(rows,-1);
        }
        while(head!=null)
        {
            int i,j;
            i=amin;
            for(j=bmin;j<=bmax;j++)
            {   if(head==null)
                break;
                a[i][j]=head.val;
                head=head.next;
            }
            amin++;
            j=bmax;
            for(i=amin;i<=amax;i++)
            {
                if(head==null)
                break;
                a[i][j]=head.val;
                head=head.next;
            
            }
            bmax--;
            i=amax;
            for(j=bmax;j>=bmin;j--)
            {
                if(head==null)
                break;
                a[i][j]=head.val;
                head=head.next;
            }
            amax--;
            j=bmin;
            for(i=amax;i>=amin;i--)
            { 
                if(head==null)
                break;
                a[i][j]=head.val;
                head=head.next;
            }
            bmin++;
        } 
       return a;
    }
}