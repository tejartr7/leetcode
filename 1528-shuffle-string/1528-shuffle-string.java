class Solution {
    public String restoreString(String s, int[] indices) {
        char []c=s.toCharArray();
        char []b=new char[s.length()];
        int i;
        int l=s.length();
        for(i=0;i<l;i++)
        {
            b[indices[i]]=c[i];;
        }
        String k=new String(b);
        return k;
        
    }
}