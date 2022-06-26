class Solution {

public TreeNode sortedListToBST(ListNode head) {
    
   if(head == null)return null;
    return SortedListTOBST(head,null);
}
public TreeNode SortedListTOBST(ListNode head, ListNode end){

   ListNode fast = head;
   ListNode slow = head;
   if(head == end)return null;
   while(fast != end && fast.next != end){
       fast = fast.next.next;
       slow=slow.next;
   }
   
   TreeNode node = new TreeNode(slow.val);
   node.left = SortedListTOBST(head,slow);
   node.right =SortedListTOBST(slow.next,end);
   
   return node;
}
}