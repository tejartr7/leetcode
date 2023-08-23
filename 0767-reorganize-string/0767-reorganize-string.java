class pair
{
    char ch;
    int cnt;
    pair(char c,int x)
    {
        ch=c;
        cnt=x;
    }
}
class Solution {
    public String reorganizeString(String s) {
        int cnt[]=new int[26];
        int i,j,n=s.length();
        char ans[]=new char[n];
        for(i=0;i<n;i++)
            cnt[s.charAt(i)-'a']++;
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.cnt-a.cnt);
        for(i=0;i<26;i++)
        {
            if(cnt[i]>0)
            {
                pq.offer(new pair((char)(i+'a'),cnt[i]));
                if(cnt[i]>(n+1)/2)
                    return "";
            }
        }
        i=0;
        while(!pq.isEmpty())
        {
            pair top=pq.poll();
            int ct=top.cnt;
            char ch=top.ch;
            while(ct>0)
            {
                ans[i]=ch;
                ct--;
                i+=2;
                if(i>=n)
                    i=1;
            }
        }
        return new String(ans);
    }
}