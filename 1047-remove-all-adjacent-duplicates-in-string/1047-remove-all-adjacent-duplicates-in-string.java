class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> a=new Stack<>();
        int i;
        int l=s.length();
        char c[]=s.toCharArray();
        for(i=0;i<l;i++)
        { if(a.isEmpty())
        {
            a.push(c[i]);
        }
         else if(c[i]==a.peek())
             a.pop();
         else
             a.push(c[i]);
        }
        String k="";
        int l1=a.size();
        while(!a.isEmpty())
            k=a.pop()+k;
        
        
        return k;
    }
}