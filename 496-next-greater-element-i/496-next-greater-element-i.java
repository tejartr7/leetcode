class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i,j,n=nums2.length;
        Stack<Integer> ans=new Stack<>();
        ans.push(nums2[n-1]);
        Map<Integer,Integer>c= new HashMap<>();
        for(i=n-2;i>=0;i--)
        {
            while(!ans.isEmpty() && ans.peek()<=nums2[i])
            {
                ans.pop();
            }
            if(ans.isEmpty())
            {
               
                ans.push(nums2[i]);
                continue;
            }
          
            
                c.put(nums2[i],ans.peek());
                ans.push(nums2[i]);
            
        }
       // Map<Integer,Integer>c= new HashMap<>();
      
        int n1=nums1.length;
        
        for(i=0;i<n1;i++)
        {
            nums1[i]=c.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}