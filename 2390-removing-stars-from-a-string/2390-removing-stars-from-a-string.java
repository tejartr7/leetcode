class Solution {
    public String removeStars(String s) {
        Stack<Character> ans=new Stack<>();
        int i;
        int n=s.length();
        for(i=0;i<n;i++)
        {
            if(!s.isEmpty() && s.charAt(i)=='*')
            {
                ans.pop();
            }
            else
            {ans.push(s.charAt(i));}
        }
        String k="";
        while(!ans.isEmpty())
        {
            k+=String.valueOf(ans.pop());
        }
        char c[]=k.toCharArray();
        int j=c.length-1;
        i=0;
        while(i<j)
        {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);
    }
}