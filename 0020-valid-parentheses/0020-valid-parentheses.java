class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
          char ch=s.charAt(i);
            if(ch==')')
            {
                if(ans.isEmpty() || ans.pop()!='(')
                    return false;
                
            }
            else if(ch==']')
            {
                if(ans.isEmpty() || ans.pop()!='[')
                    return false;
                
            }
            else  if(ch=='}')
            {
                if(ans.isEmpty() || ans.pop()!='{')
                    return false;
                
            }
            else
                ans.push(s.charAt(i));
        }
        if(ans.isEmpty())
        return true;
        return false;
    }
}