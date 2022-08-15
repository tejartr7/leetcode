int hammingWeight(uint32_t n) {
     int count=0;
        int k=n;
        int s;
        while(n>0)
        {
            
           
            if(n%2==1)
            {
                count++;
            }
             n=n/2;
            s=0;
        }
        return count;
}