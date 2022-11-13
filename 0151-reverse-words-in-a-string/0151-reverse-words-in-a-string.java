class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        List<String> set=new ArrayList<>();
        String ans="";
        int i,count=0;
        int n=a.length;
        for(i=0;i<a.length;i++)
        {
            if(a[i].contains(" ") || a[i].equals(" ")|| a[i].equals(""))
            {  
                a[i]="";
            }
            else if(count==0)
            {
                count++;
            }
            else
            {
                a[i]+=" ";
            }
        }
        for(i=0;i<a.length;i++)
        {
            ans=a[i]+ans;
        }
        
        return ans;
    }
}