class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        // To skip till left we iterate till where we want our          reverse our linkedList
        for(int i =0;current != null && i<left-1;i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;  // store this values which helps to point at the end which is 1 
        ListNode newEnd = current; // newEnd = 2

        // reverse the linkedList 
        ListNode next = current.next;
        for(int i =0;current != null && i<right - left +1;i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        if(last!= null){
            last.next = prev;  // point last to prev which is 4 at this poiny
        }else{
            head = prev;
        }

        newEnd.next = current;  // point newEnd to current which is 5 at this point.
        return head;
    }
}