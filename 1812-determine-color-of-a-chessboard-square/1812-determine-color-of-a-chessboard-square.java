class Solution {
    public boolean squareIsWhite(String c) {
        char a[]=c.toCharArray();
        String p=String.valueOf(a[0]);
        int q=a[1]-'0';
        
        String m="aceg";
        String n="bdfh";
        if(m.contains(p))
        {
            if(q%2==0)
                return true;
            return false;
            
        }
        else if(n.contains(p))
        {
            if(q%2==1)
                return true;
            return false;
        }
       return true;     
    }
}