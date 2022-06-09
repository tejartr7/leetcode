class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []a=new int[2];
        int start=0;
        int l=numbers.length;
        int end=l-1;
        int sum=0;
        Arrays.fill(a,0);
        while(start<end)
        {
            sum=numbers[start]+numbers[end];
              if(sum==target)
            {
               a[0]=start+1;
                a[1]=end+1;
                  break;
                
            }
            
            if(sum>target)
                end--;
            else if(sum<target)
                start++;
          
                
        }
        return a;
    }
}
