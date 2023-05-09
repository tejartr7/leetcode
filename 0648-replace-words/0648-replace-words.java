class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>();
        for(String x:dictionary)
            set.add(x);
        String temp[]=sentence.split(" ");
        int i,j;
        StringBuilder ans=new StringBuilder();
        for(i=0;i<temp.length;i++)
        {
            boolean found=false;
            if(temp[i].equals(" "))
                continue;
            for(j=0;j<temp[i].length();j++)
            {
                String sub=temp[i].substring(0,j+1);
                if(set.contains(sub))
                {
                    if(i!=temp.length-1)
                    {sub+=" ";
                     ans.append(sub);
                    }
                    else 
                    {ans.append(sub);
                    }
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                if(i!=temp.length-1)
                {
                    ans.append(temp[i]);
                    ans.append(" ");
                }
                else ans.append(temp[i]);
            }
        }
        return ans.toString();
    }
}