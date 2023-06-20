class Solution {
    long mini=Integer.MAX_VALUE;
    public int helper(int i,char ch[])
    {
        int n=ch.length;
        if(i==n)
            return 0;
        String temp=new String(ch);
        if(!(temp.contains("0") && temp.contains("1"))) return 0;
        char t[]=ch;
        for(int x=0;x<=i;x++)
            t[i]=ch[i]=='1'?'0':'1';
        int x=i+1+helper(i+1,t);
        t=ch;
        for(int k=i;k<n;k++)
            t[i]=ch[i]=='1'?'0':'1';
        int y=n-i+helper(i+1,t);
        int z=helper(i+1,ch);
        return Math.min(x,Math.min(y,z));
    }
    public long minimumCost(String s) {  
        long ans=0;
        int i,n=s.length();
        for(i=1;i<n;i++)
        {
            if(s.charAt(i-1)!=s.charAt(i))
            {
                ans+=Math.min(i,n-i);
            }
        }
        return ans;
    }
}