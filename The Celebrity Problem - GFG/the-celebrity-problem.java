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
    	int ans=-1;
    	Stack<Integer> stack=new Stack<>();
    	for(i=0;i<n;i++)
    	{
    	    stack.push(i);
    	}
    	while(stack.size()>1)
    	{
    	    int x=stack.pop();
    	    int y=stack.pop();
    	    if(a[x][y]==0)
    	    {
    	        stack.push(x);
    	    }
    	    else if(a[y][x]==0)
    	    {
    	        stack.push(y);
    	    }
    	}
    	if(stack.size()==0)
    	return -1;
        int x=stack.peek();
        boolean row=true,col=true;
        for(j=0;j<n;j++)
        {
            if(a[x][j]==1)
            return -1;
        }
        int count=0;
        for(i=0;i<n;i++)
        {
            if(a[i][x]==1)
            count++;
        }
        if(count!=n-1)
        return -1;
        return x;
    }
}