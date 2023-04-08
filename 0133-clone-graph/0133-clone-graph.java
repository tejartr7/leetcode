
class Solution {
    Node []copy=new Node[100];
    public Node cloneGraph(Node node) {
        if(node==null)
            return node;
        if(copy[node.val-1]==null)
        {
            copy[node.val-1]=new Node(node.val);
            for(Node x:node.neighbors)
            {
                copy[node.val-1].neighbors.add(cloneGraph(x));
            }
        }
        return copy[node.val-1];
    }
}