class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i,j,n=nums2.length;
        int a[]=new int[n];
        Stack<Integer> ans=new Stack<>();
        a[n-1]=-1;
        ans.push(nums2[n-1]);
        for(i=n-2;i>=0;i--)
        {
            while(!ans.isEmpty() && ans.peek()<=nums2[i])
            {
                ans.pop();
            }
            if(ans.isEmpty())
            {
                a[i]=-1;
                ans.push(nums2[i]);
                continue;
            }
          
                a[i]=ans.peek();
                ans.push(nums2[i]);
            
        }
        Map<Integer,Integer>c= new HashMap<>();
        for(i=0;i<n;i++)
        {
            c.put(nums2[i],a[i]);
        }
        int n1=nums1.length;
        int x[]=new int[n1];
        for(i=0;i<n1;i++)
        {
            x[i]=c.get(nums1[i]);
        }
        return x;
    }
}