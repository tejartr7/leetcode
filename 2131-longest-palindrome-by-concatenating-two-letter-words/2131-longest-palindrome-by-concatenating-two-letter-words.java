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
        {   if(isPalan(words[i]) && map.containsKey(words[i]))
            {
                int x=map.get(words[i]);
                temp+=x/2;
                if(x%2==0)
                {
                    map.remove(words[i]);
                }
                else
                {
                    map.put(words[i],x%2);
                }
            }
            else 
            {
                if(map.containsKey(rev(words[i])) && map.containsKey(words[i]))
                {   if(map.get(rev(words[i]))>0 && map.get(words[i])>0){
                    ans++;
                    map.put(rev(words[i]),map.get(rev(words[i]))-1);
                    map.put(words[i],map.get(words[i])-1);
                    }
                    
                }
            }
        }
       for(String x:map.keySet())
       {
           if(isPalan(x))
           {
               if(map.get(x)>0)
                   count=1;
           }
       }
        return (temp+ans)*4+count*2;
    }
}