class pair {
    int val;
    int index;

    pair(int val, int index) {
        this.val = val;
        this.index = index;
    }
}

class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<String> set=new HashSet<>();
        int i,j,n=nums.length;
        for(i=0;i<n;i++)
        {
            int div=0;
            StringBuilder sb=new StringBuilder();
            for(j=i;j<n;j++)
            {
                sb.append(nums[j]);
                sb.append(",");
                if(nums[j]%p==0)
                    div++;
                if(div>k)
                    break;
                set.add(sb.toString());
            }
        }
        return set.size();
    }
}