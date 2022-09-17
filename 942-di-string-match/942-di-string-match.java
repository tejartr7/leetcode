class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length(),i;
        int l=0,h=n;
        int []a=new int[n+1];
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='I')
            {
                a[i]=l++;
            }
            else
                a[i]=h--;
            
        }
        a[n]=h;
        return a;
    }
}