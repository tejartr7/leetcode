class Solution {
    public String removeKdigits(String num, int k) {
        String ans="";
        Stack<Character> stack=new Stack<>();
        int i,n=num.length();
        int x=k;
        if(n==k)
        return "0";
        for(i=0;i<n;i++)
        {
            char ch=num.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(num.charAt(i));
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()>ch && k>0)
                {
                    stack.pop();
                    k--;
                }
                stack.push(num.charAt(i));
            }
        }
        while(!stack.isEmpty() && k>0)
        {
            stack.pop();
            k--;
        }
        k=x;
        while(!stack.isEmpty())
        {
            ans=stack.pop()+ans;
        }
        i=0;
        while(i<ans.length())
        {
            if(ans.charAt(i)=='0')
            i++;
            else
            break;
        }
        ans=ans.substring(i);
        return ans.length()==0?"0":ans;
    }
}