class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        // O(n) time | O(n) space
        HashSet<Character> mySet = new HashSet<>();
        
        int left = 0, right = 0;
        int max = 0;
        
        while(right < s.length())
        {
            char ch = s.charAt(right);
            
            if(!mySet.contains(ch))
            {
                mySet.add(ch);
                right++;
                max = Math.max(max, mySet.size());
            }
            else
            {
                mySet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}