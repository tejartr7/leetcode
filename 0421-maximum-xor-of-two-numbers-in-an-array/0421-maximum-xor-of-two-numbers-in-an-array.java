class Trie
{
    Trie links[]=new Trie[2];
    Trie get(int x)
    {
        return links[x];
    }
    void set(int x,Trie node)
    {
        links[x]=node;
    }
    boolean contains(int x)
    {
        return links[x]!=null;
    }
}
class Solution {
    Trie root;
    public void insert(int nums[])
    {
        root=new Trie();
        int i,j,n=nums.length;
        for(i=0;i<n;i++)
        {   Trie curr=root;
            for(j=31;j>=0;j--)
            {
                int x=(nums[i]>>j)%2;
                if(!curr.contains(x))
                {
                    curr.set(x,new Trie());
                }
                curr=curr.get(x);
            }
        }
    }
    public int findMaximumXOR(int[] nums) {
        int i,j,n=nums.length;
        int maxi=0;
        insert(nums);
        //System.out.println(root);
        for(i=0;i<n;i++)
        {   Trie curr=root;
            int currSum=0;
            for(j=31;j>=0;j--)
            {
                int x=1-(nums[i]>>j)%2;
                if(curr.contains(x))
                {
                    curr=curr.get(x);
                    currSum|=(1<<j);
                }
                else
                curr=curr.get(1-x);
            }
            maxi=Math.max(maxi,currSum);
        }
        return maxi;
    }
}