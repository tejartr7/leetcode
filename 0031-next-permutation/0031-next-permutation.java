class Solution {
    public boolean helper(int []nums,int i)
    {
        int curr=nums[i];
        int max=0;
        boolean flag=false;
        List<Integer> list=new ArrayList<>();
        int index=-1;
        for(int j=i;j<nums.length;j++)
        {
            if(nums[j]>nums[i])
            {
                if(max>nums[j])
                { max=nums[j];
                index=j-i;
                }
                else if(max==0)
                { max=nums[j];
                 index=j-i;}
            }
            list.add(nums[j]);
        }
        if(index==-1)
            return false;
        list.remove(index);
        Collections.sort(list);
        nums[i]=max;
        i++;
        for(int j=0;j<list.size();j++)
        {
            nums[i+j]=list.get(j);
        }
        return true;
    }
    public void nextPermutation(int[] nums) {
        int first_max=0,second_max=0;
        int i,j,n=nums.length;
        boolean found=false;
        for(i=n-2;i>=0;i--)
        {
            if(helper(nums,i))
            {found=true;
            break;
            }
        }
        if(!found)
            Arrays.sort(nums);
    }
}