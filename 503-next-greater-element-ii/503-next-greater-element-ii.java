class Solution {
    int[] getng(int nums[])
    {
        Stack<Integer> a=new Stack<>();
        int i,n=nums.length;
        int ans[]=new int[n];
        a.push(nums[n-1]);
        ans[n-1]=-1;
        for(i=n-2;i>=0;i--)
        {
            if(a.isEmpty())
            {
                a.push(nums[i]);
                ans[i]=-1;
            }
            else
            {
                while(!a.isEmpty() && a.peek()<=nums[i])
                {
                    a.pop();
                }
                if(!a.isEmpty())
                ans[i]=a.peek();
                if(a.isEmpty())
                    ans[i]=-1;
                a.push(nums[i]);
            }
        }
        return ans;
    }
     int[] getpg(int nums[])
    {
        Stack<Integer> a=new Stack<>();
        int i,n=nums.length;
        int ans[]=new int[n];
        a.push(nums[0]);
        ans[0]=-1;
        for(i=1;i<n;i++)
        {
            if(a.isEmpty())
            {
                a.push(nums[i]);
                ans[i]=-1;
            }
            else
            {
                while(!a.isEmpty() && a.peek()<=nums[i])
                {
                    a.pop();
                }
                if(!a.isEmpty())
                ans[i]=a.peek();
                if(a.isEmpty())
                    ans[i]=-1;
                a.push(nums[i]);
            }
        }
        return ans;
    }
    public int[] nextGreaterElements(int[] nums) {
        int i,n=nums.length;
        int pg[]=new int[n];
        int ng[]=new int[2*n];
        for(i=0;i<n;i++)
        {
            ng[i]=nums[i];
            ng[i+n]=nums[i];
        }
        ng=getng(ng);
        pg=getpg(nums);
        int max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
       max=Math.max(max,nums[i]);
        }
        for(i=0;i<n;i++)
        {
            if(ng[i]==-1 && nums[i]==max)
            {
                nums[i]=-1;
            }
           else
               nums[i]=ng[i];
           
        }
        return nums;
    }
}