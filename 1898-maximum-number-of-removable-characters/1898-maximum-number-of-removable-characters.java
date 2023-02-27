class Solution {
    boolean valid(char ch[],String p)
    {
        int i=0,j=0;
        while(i<ch.length && j<p.length())
        {
            if(ch[i]==p.charAt(j))
            {
                j++;
            }
            i++;
        }
        return j==p.length();
    }
    public int maximumRemovals(String s, String p, int[] removable) {
        //Arrays.sort(removable);
        char ch[]=s.toCharArray();
        int l=0,h=removable.length;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            for(int i=0;i<mid;i++)
                ch[removable[i]]='/';
            if(valid(ch,p))
            {
               l=mid+1; 
            }
            else
            {
                for(int i=0;i<mid;i++)
                    ch[removable[i]]=s.charAt(removable[i]);
                h=mid-1;
            }
        }
        return h;
    }
}