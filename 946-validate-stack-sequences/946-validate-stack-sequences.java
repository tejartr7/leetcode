class Solution {
    public boolean validateStackSequences(int[] p, int[] popped) {
       int i,n=p.length; 
        Stack<Integer> ans=new Stack<>();
        int j=0;
        for(i=0;i<n;i++)
        {
           ans.push(p[i]);
            while(!ans.isEmpty() && ans.peek()==popped[j])
            {
                
                ans.pop();
                j++;
            }
             
        }
        while(!ans.isEmpty() && ans.peek()==popped[j])
        {
            ans.pop();
            j++;
        }
        if(j==popped.length)
            return true;
        return false;
        
    }
}