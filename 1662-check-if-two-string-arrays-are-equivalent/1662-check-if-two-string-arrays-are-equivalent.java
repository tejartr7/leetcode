class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        String b="";
        int i;
        int l1=word1.length;
        int l2=word2.length;
        for(i=0;i<l1;i++)
        {
            a+=word1[i];
        }
        for(i=0;i<l2;i++)
        {
            b+=word2[i];
        }
        if(a.equals(b))
            return true;
        return false;
    }
}