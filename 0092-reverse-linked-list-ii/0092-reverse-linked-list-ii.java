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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        int arr[] = new int[count];
        int i = 0;
        curr = head;
        while (curr != null) {
            arr[i++] = curr.val;
            curr = curr.next;
        }
        left--;
        right--;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
        curr = head;
        i = 0;
        while (curr != null) {
            curr.val = arr[i++];
            curr = curr.next;
        }
        return head;
    }
}