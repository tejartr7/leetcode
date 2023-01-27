class Solution {
    public String getHint(String secret, String guess) {
        String ans="";
        int common=0;
        int i;
        int a[]=new int[10];
        int b[]=new int[10];
        for(i=0;i<secret.length();i++)
        {
            int c=secret.charAt(i)-'0';
            a[c]++;
        }
        for(i=0;i<secret.length();i++)
        {
            int c=guess.charAt(i)-'0';
            b[c]++;
        }
        for(i=0;i<10;i++)
        {
            common+=Math.min(a[i],b[i]);
        }
      //  System.out.println(common);
        int y=0;
        for(i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
                y++;
        }
        ans=y+"A"+(common-y)+"B";
        return ans;
    }
}