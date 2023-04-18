//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int target;
            target = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.minSubtreeSumBST(target, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int mini=10000000;
     public static boolean isBst(Node root,int le,int ri){
       if(root==null) return true;
       if(root.data<=le || root.data>=ri) return false;
       return isBst(root.left,le,root.data) && isBst(root.right,root.data,ri);
    }


    public static void getSum(Node root,int x[],int y[])
    {
        if(root==null)
        return ;
        x[0]+=root.data;
        y[0]+=1;
        getSum(root.left,x,y);
        getSum(root.right,x,y);
    }
    public static void helper(int target,Node root)
    {
        if(root==null)
        return ;
        int x[]=new int[1];
        int y[]=new int[1];
        x[0]=y[0]=0;
        getSum(root,x,y);
        if(x[0]==target)
        {
            if(isBst(root,-10000000,10000000))
            mini=Math.min(mini,y[0]);
            //System.out.println(y[0]);
        }
        helper(target,root.left);
        helper(target,root.right);
    }
    public static int minSubtreeSumBST(int target, Node root) {
        // code here
        helper(target,root);
        int ans=mini;
        mini=10000000;
        return ans==10000000?-1:ans;
    }
}