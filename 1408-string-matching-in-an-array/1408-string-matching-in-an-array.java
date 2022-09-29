class Solution {
    public List<String> stringMatching(String[] words) {
        int i,j,n=words.length;
        List<String> result=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j && words[i].contains(words[j]))
                {   if(!result.contains(words[j]))
                    result.add(words[j]);
                }
            }
        }
        return result;
    }
}