class Solution {
    public int[] countBits(int n) {
        int i=0;
      
        int []a=new int[n+1];
        while(i<=n)
        {
           String s=Integer.toBinaryString(i);
             int count=0;
              int ii;
            int l=s.length();
            for(ii=0;ii<l;ii++)
            {
                char aa=s.charAt(ii);
                if(aa=='1')
                    count++;
                
            }
            a[i]=count;
            count=0;
            i++;
            
        
        }
        return a;
    }
}