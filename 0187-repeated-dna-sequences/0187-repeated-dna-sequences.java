class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set=new HashSet<>();
        List<String> ans=new ArrayList<>();
        int i=0,j=0,n=s.length();
        while(j<n)
        {
            if(j-i+1==10)
            {
                String sub=s.substring(i,j+1);
                if(set.contains(sub))
                {
                    if(!ans.contains(sub))
                    ans.add(sub);
                }
                else
                    set.add(sub);
                i++;
            }
            j++;
        }
        return ans;
    }
}