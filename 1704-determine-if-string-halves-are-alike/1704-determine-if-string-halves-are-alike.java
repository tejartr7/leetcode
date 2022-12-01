class Solution {
    public int countVowels(String a)
    {
        int count=0;
        int i,n=a.length();
        for(i=0;i<n;i++)
        {
            char ch=a.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String a=s.substring(0,n/2);
        String b=s.substring(n/2,n);
        a=a.toLowerCase();
        b=b.toLowerCase();
        int x=countVowels(a);
        int y=countVowels(b);
        return x==y;
    }
}