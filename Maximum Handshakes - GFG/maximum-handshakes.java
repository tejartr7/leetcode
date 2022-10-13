//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            long N = Long.parseLong(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.handShakes(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long handShakes(long N){
        // code here
        return N*(N-1)/2;
    }
}