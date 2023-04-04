class Solution {
    public int longestValidParentheses(String s) {
        int maxi=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' || stack.size()==1)
                stack.push(i);
            else
            {
                if(stack.peek()!=-1 && s.charAt(stack.peek())=='(')
                { stack.pop();
                  maxi=Math.max(maxi,i-stack.peek());
                }
                else
                    stack.push(i);
            }
        }
        return maxi;
    }
}