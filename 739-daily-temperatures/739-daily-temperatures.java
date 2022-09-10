class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l=temperatures.length;
        int i,j;
        int []a=new int[l];
        int count=0;
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(temperatures[j]>temperatures[i])
                {
                    a[i]=j-i;
                    break;
                    
                }
                
            }
        }
        return a;
    }
}