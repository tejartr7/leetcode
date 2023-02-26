class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0;
        int n=s.length();
        int count=0,maxi=0;
        String vowel="aeiou";
        while(j<n)
        {
            String temp=String.valueOf(s.charAt(j));
            if(vowel.contains(temp))
            {
                count++;
            }
            if(j-i+1==k)
            {
                maxi=Math.max(maxi,count);
                temp=String.valueOf(s.charAt(i));
                if(vowel.contains(temp))
                    count--;
                i++;
            }
            j++;
        }
        return maxi;
    }
}