/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    Stack<TreeNode> stack=new Stack<>();
    public BSTIterator(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null)
        {stack.push(curr);
        curr=curr.left;
        }
    }
    
    public int next() {
        if(stack.isEmpty())
            return -1;
        TreeNode x=stack.pop();
        int y=x.val;
        x=x.right;
        while(x!=null)
        {
            stack.push(x);
            x=x.left;
        }
        return y;
    }
    
    public boolean hasNext() {
        return stack.size()>0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */