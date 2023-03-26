class Solution {
    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        int first_max=0,second_max=0;
        int i,j,n=nums.length;
        int index=-1;
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
            Arrays.sort(nums);
        else
        {
            for(i=n-1;i>index;i--)
            {
                if(nums[i]>nums[index])
                {
                    swap(nums,i,index);
                    break;
                }
            }
            int x=index+1,y=n-1;
            while(x<y)
            {
                swap(nums,x,y);
                x++;
                y--;
            }
        }
    }
}