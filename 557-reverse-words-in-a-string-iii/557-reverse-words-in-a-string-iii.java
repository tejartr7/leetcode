class Solution {
    private String reverse(String a)
    {
        int start=0;
        int end=a.length()-1;
        char c[]=a.toCharArray();
        while(start<end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
        return new String(c);
    }
    public String reverseWords(String s) {
      String k[]=s.split(" ");
        int i;
        int l=k.length;
        String ans[]=new String[l];
        for(i=0;i<l;i++)
        {
         ans[i]=reverse(k[i]);   
        }
        String p="";
        p+=ans[0];
        for(i=1;i<l;i++)
        {
            p=p+" "+ans[i];
        }
        return p;
            
    }
}