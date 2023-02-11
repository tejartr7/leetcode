/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //this function returns the mid and also make the linkedlist two parts
    //the node previous to mid points to null after we find the mid
    public ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode prev=null;
        while (fast != null && fast.next != null) {
            prev=slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        if(prev!=null)
        prev.next=null;
        return slow;
    }
    //this function merges two sorted linked lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = new ListNode(-1);
        ListNode curr = a;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;

            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        while (list1 != null) {
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }
        while (list2 != null) {
            curr.next = list2;
            list2 = list2.next;
            curr = curr.next;
        }
        return a.next;
    }
    //this is our base function
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid = getMid(head);
        ListNode right = mid.next;
        ListNode left = head;
        left = sortList(left);
        right = sortList(mid);
        ListNode result = mergeTwoLists(left, right);
        return result;
    }
}