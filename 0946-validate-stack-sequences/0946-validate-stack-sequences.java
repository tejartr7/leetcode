class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i,j,n=pushed.length;
        Stack<Integer> stack=new Stack<>();
        j=0;
        for(i=0;i<n;i++)
        {
            stack.push(pushed[i]); 
            while(!stack.isEmpty() && j<n && stack.peek()==popped[j])
            {
                stack.pop();
                j++;
            }
        }
        
        return j==n;
    }
}