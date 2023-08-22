class Solution {
    public String convertToTitle(int val){
        String ans="";
        while(val>26)
        {
            int temp=val%26;
            char ch=(char)(temp-1+'A');
            if(temp!=0)
            ans=ch+ans;
            else ans='Z'+ans;
            val/=26;
            if(ans.charAt(0)=='Z')
                val--;
        }
        if(val>0)
        {
            //val-=1;
           char ch=(char)(val-1+'A');
           ans=ch+ans; 
        }
        return ans;
    }
}