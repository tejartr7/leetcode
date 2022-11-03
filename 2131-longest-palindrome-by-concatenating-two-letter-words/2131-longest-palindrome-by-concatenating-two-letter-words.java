import java.util.*;

class Solution {
    public boolean isPalan(String x) {
        if (x.charAt(0) == x.charAt(1))
            return true;
        return false;
    }
    public String rev(String x)
    {
        String temp=String.valueOf(x.charAt(1))+String.valueOf(x.charAt(0));
        return temp;
    }
    public int longestPalindrome(String[] words) {
        int ans=0;
        int count=0,temp=0;
        int i,n=words.length;
        Map<String,Integer> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
           map.put(words[i],map.getOrDefault(words[i], 0)+1);        
        }
        for(i=0;i<n;i++)
        {
            if(isPalan(words[i]))
            {
                int x=map.get(words[i]);
                temp+=x/2;
                map.put(words[i],x%2);
            }
            else
            {
             if(map.containsKey(rev(words[i])))
             {
                int min=Math.min(map.get(rev(words[i])),map.get(words[i]));
                map.put(words[i],map.get(words[i])-min);
                map.put(rev(words[i]),map.get(rev(words[i]))-min);
                temp+=min;
             }
            }
        }
        temp*=4;
        for(String x:map.keySet())
        {
            if(isPalan(x) && map.get(x)>0)
            {
                temp+=2;
                break;
            }
        } 
        return temp;
    }
}