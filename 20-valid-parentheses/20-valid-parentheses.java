class Solution {
    public boolean isValid(String s) {
    
    if(s.length()%2==1 )
        return false;
        char a[]=s.toCharArray();
        int i;
        int l=s.length();
        Stack<Character> b=new Stack<>();
        for(i=0;i<l;i++)
        {
            if(a[i]==')')
            {
                if(b.isEmpty() ||b.pop()!='(')
                    return false;
                
            }
           else if(a[i]==']')
            {
                if(b.isEmpty() ||b.pop()!='[')
                    return false;
                
            }
            else if(a[i]=='}')
            {
                if(b.isEmpty() ||b.pop()!='{')
                    return false;
                
            }
            else
                b.push(a[i]);
            
        }
    return b.isEmpty();
    
    
    }
}