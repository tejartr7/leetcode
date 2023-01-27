class Solution {
    public String getHint(String secret, String guess) {
       //Time complexity=O(n+n)~O(n)
        //Space complexity=O(10+2)~O(1)
       int x=0,y=0;
       int a[]=new int[10];
       int i,n=secret.length();
        for(i=0;i<n;i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
                x++;
            a[secret.charAt(i)-'0']++;
        }
        for(i=0;i<n;i++)
        {
            if(a[guess.charAt(i)-'0']>0)
                y++;
            a[guess.charAt(i)-'0']--;
        }
        return x+"A"+(y-x)+"B";
    }   
}