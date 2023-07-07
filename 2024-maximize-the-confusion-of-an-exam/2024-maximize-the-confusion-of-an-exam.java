class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int ans=0;
        int i,j,cnt,n=s.length();
        i=j=cnt=0;
        while(j<n)
        {
            if(s.charAt(j)=='F')
                cnt++;
            while(cnt>k)
            {
                if(s.charAt(i)=='F')
                    cnt--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        i=j=cnt=0;
        while(j<n)
        {
            if(s.charAt(j)=='T')
                cnt++;
            while(cnt>k)
            {
                if(s.charAt(i)=='T')
                    cnt--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}