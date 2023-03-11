
class Solution {
    public TreeNode helper(List<Integer> list,int index)
    {
        if(index>=list.size() || index<0) return null;
        TreeNode root=new TreeNode(list.get(index));
        root.left=helper(list,index/2);
        root.right=helper(list,index+(list.size()-index)/2);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode slow=head,fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode root=new TreeNode(slow.val);
        //System.out.println(prev.val);
        if(prev!=null)
        prev.next=null;
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);
        return root;
    }
}