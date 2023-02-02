class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map=new HashMap<>();
        int i,j,n=words.length;
        for(i=0;i<26;i++)
        {
            map.put(order.charAt(i),i);
        }
        int pre=-1;
       // System.out.println(n);
        for(i=1;i<n;i++)
        {
            if(words[i-1].length()>words[i].length() && words[i-1].startsWith(words[i]))
                return false;
            else
            {
                int l=Math.min(words[i-1].length(),words[i].length());
                for(j=0;j<l;j++)
                {
                    int prev=map.get(words[i-1].charAt(j));
                    int curr=map.get(words[i].charAt(j));
                    if(prev>curr)
                        return false;
                    else if(prev<curr)
                        break;
                }
               
            }
            
        }
        return true;
    }
}