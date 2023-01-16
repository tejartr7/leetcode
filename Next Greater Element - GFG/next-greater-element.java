//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        Stack<Long> stack=new Stack<>();
        long ans[]=new long[n];
        ans[n-1]=-1;
        stack.push(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            while(!stack.isEmpty())
            {
                if(stack.peek()>arr[i])
                {
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty())
            {
                ans[i]=-1;
            }
            else
            ans[i]=stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    } 
}