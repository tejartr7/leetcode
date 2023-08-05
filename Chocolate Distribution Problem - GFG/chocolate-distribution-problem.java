//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
    
        int b[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        b[i]=a.get(i);

        Arrays.sort(b);
        int min=100000;
        int x=0;
        int k=m;
        for(i=0;i<n-m+1;i++)
        {
            min=Math.min(b[m+i-1]-b[i],min);
        }
        return (long)min;
    }
}