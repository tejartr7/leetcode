//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int a[][], int n)
    {
    	// code here 
    	int i,j;
    	List<Integer> list=new ArrayList<>();
    	int ans=-1;
    	int count[]=new int[n];
    	for(i=0;i<n;i++)
    	{
    	    int c=0;
    	    for(j=0;j<n;j++)
    	    {
    	        if(a[i][j]==1)
    	        {count[j]++;
    	        c++;}
    	    }
    	    if(c==0)
    	    list.add(i);
    	}
    	int c=0;
    //	System.out.print(list);
    	for(i=0;i<n;i++)
    	{
    	    if(count[i]==n-1 && list.contains(i))
    	    {
    	        ans=i;
    	    }
    	}
    	return ans;
    }
}