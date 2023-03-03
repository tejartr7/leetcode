class Solution {
    public void backTrack(int index,List<String> list,String digits,StringBuilder sb,
                         String arr[])
    {
        if(sb.length()==digits.length())
        {
            list.add(sb.toString());
            return ;
        }
        else
        {
            int x=digits.charAt(index)-'0';
            for(int i=0;i<arr[x].length();i++)
            {
                sb.append(arr[x].charAt(i));
                backTrack(index+1,list,digits,sb,arr);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0)
            return list;
        String arr[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backTrack(0,list,digits,new StringBuilder(),arr);
        return list;
    }
}