class Solution {
    public int longestContinuousSubstring(String s) {
        int max=1;
        int i,n=s.length();
        int count=1;
        
        for(i=1;i<n;i++)
        {
            if(s.charAt(i)==1+s.charAt(i-1))
            {  count++;
            max=Math.max(count,max);}
            else
            {  count=1;
            }
        }
        return max;
    }
}