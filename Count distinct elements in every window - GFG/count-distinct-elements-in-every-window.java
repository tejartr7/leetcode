// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
   ArrayList<Integer> countDistinct(int A[], int n, int k)
   {
       HashMap<Integer,Integer>hm=new HashMap<>();
       int prev=-1;
       ArrayList<Integer>ans=new ArrayList<>();
       for(int i=0;i<k;i++)
       {
           hm.put(A[i],hm.getOrDefault(A[i],0)+1);
       }
       ans.add(hm.size());
       for(int i=k;i<A.length;i++)
       {
           //acquire
           hm.put(A[i],hm.getOrDefault(A[i],0)+1);
           //release
           prev+=1;
           hm.put(A[prev],hm.get(A[prev])-1);
           if(hm.get(A[prev])==0)
           {
               hm.remove(A[prev]);
           }
           ans.add(hm.size());   
       }
       return ans;
   }
}
        

