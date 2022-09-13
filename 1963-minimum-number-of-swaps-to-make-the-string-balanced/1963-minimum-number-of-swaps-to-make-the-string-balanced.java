class Solution {
    public int minSwaps(String s) {
     int close_bracket_count=0, max_close_bracket_count=Integer.MIN_VALUE;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==']')
close_bracket_count++;
else
close_bracket_count--;
max_close_bracket_count=Math.max(max_close_bracket_count,close_bracket_count);
}
return (max_close_bracket_count+1)/2;
    }
}