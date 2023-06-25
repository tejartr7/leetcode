class Solution {
    public String rev(char ch[])
    {
        int i=0,j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set=new HashSet<>();
        for(String x:words)
        {
            set.add(x);
        }
        int cnt=0;
        for(String x:words)
        {
            String temp=rev(x.toCharArray());
            if(temp.equals(x))
                continue;
            if(set.contains(temp))
            {
                cnt++;
                set.remove(temp);
                set.remove(x);
            }
        }
        return cnt;
    }
}