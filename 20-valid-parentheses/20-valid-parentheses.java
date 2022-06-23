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
            switch(a[i])
            {
                case ')':if(b.isEmpty() || b.pop()!='(')
                    return false;
                    break;
                case '}':if(b.isEmpty() ||b.pop()!='{')
                    return false;
                    break;
                       case ']':if(b.isEmpty() ||b.pop()!='[')
                    return false;
                    break;
                default:b.push(a[i]);
                    break;
                
            }
        }
    return b.isEmpty();
    
    
    }
}