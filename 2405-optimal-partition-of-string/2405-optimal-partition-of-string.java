class Solution {
    public int partitionString(String s) {
        int count=1;
        int i,n=s.length();
        Set<Character> set=new HashSet<>();
        for(i=0;i<n;i++)
        {
            if(set.contains(s.charAt(i)))
            {
                count++;
                set.clear();
                set.add(s.charAt(i));
            }
            else
            {
                set.add(s.charAt(i));
            }
        }
        return count;
    }
}