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
    	for(i=0;i<n;i++)
    	{
    	    int count=0;
    	    int ind=-1;
    	    for(j=0;j<n;j++)
    	    {
    	        if(a[j][i]==1)
    	        count++;
    	    }
    	    if(count==n-1)
    	    list.add(i);
    	}
    	//System.out.println(list);
    	for(int x:list)
    	{
    	    boolean found=true;
    	    int val=-1;
    	    for(i=0;i<n;i++)
    	    {
    	        if(a[i][x]==0)
    	        {
    	            val=i;
    	            break;
    	        }
    	    }
    	    for(j=0;j<n;j++)
    	    {
    	        if(a[val][j]==1)
    	        {
    	            found=false;
    	            break;
    	        }
    	    }
    	    if(found)
    	    {
    	        ans=val;
    	        return ans;
    	    }
    	}
    	return ans;
    }
}