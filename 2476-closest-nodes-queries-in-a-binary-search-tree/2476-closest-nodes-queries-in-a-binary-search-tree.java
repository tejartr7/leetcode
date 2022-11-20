
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
import java.util.ArrayList;
import java.util.LinkedList;


class Solution {
    TreeSet<Integer> ts=new TreeSet<>();
	public void helper(TreeNode root) {
        if (root != null) {
            helper(root.left);
            ts.add(root.val);
            helper(root.right);
        }
    }
	public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
		int i;
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		helper(root);
		for (i = 0; i < queries.size(); i++) {
            int val = queries.get(i);
			List<Integer> r = new LinkedList<>();
			Integer smaller=ts.floor(val);
            Integer greater=ts.ceiling(val);
            if(smaller==null)
                smaller=-1;
            if(greater==null)
                greater=-1;
            r.add(smaller);
            r.add(greater);
			ans.add(r);
		}
		return ans;
	}
}