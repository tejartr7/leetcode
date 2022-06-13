class Solution {
    public boolean isMonotonic(int[] nums) {
        int count=0;
        int i;
        int l=nums.length;
       int []a=new int[l];
        for(i=0;i<l;i++)
            a[i]=nums[i];
        Arrays.sort(a);
int []b=new int[l];
        for(i=l-1;i>=0;i--)
            b[i]=a[l-1-i];
        
            
        
    if(l>0){
    if(a[0]==nums[0])
    {
        for(i=0;i<l;i++)
        {
            if(nums[i]==a[i])
                count++;
            else
                break;
        }
        if(count==l)
            return true;
    else
        return false;
    }
     if(b[0]==nums[0])
    {
        for(i=0;i<l;i++)
        {
            if(nums[i]==b[i])
                count++;
            else
                break;
        }
        if(count==l)
            return true;
    else
        return false;
    }
    }
      return false;
    }
}