class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        int i;
        int l=letters.length;
        char min='a';
        if(target>=letters[l-1])
            {
             return letters[0];   
            }
        for(i=0;i<l;i++)
        {
             if(letters[0]>target)
                return letters[0];
                if(letters[i]>target)
                    return letters[i];
            
           
        }
        return min;
    }
}