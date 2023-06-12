//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends



class Solution{
    int maxi=0;
    int dp[];
    public int helper(int p[],int idx)
    {
        if(idx==p.length)
        {
           return 0;
        }
        if(idx>p.length) return -1;
      //  System.out.println(idx+" "+sum);
        if(dp[idx]!=-1) return dp[idx];
        int ans=0;
        for(int i=1;i<=p.length;i++)
        {
            int temp=helper(p,idx+i);
            if(temp==-1) break;
            ans=Math.max(ans,temp+p[i-1]);
        }
        return dp[idx]=ans;
    }
    public int cutRod(int price[], int n) {
        //code here
        //dp problem
        dp=new int[n];
        Arrays.fill(dp,-1);
        return helper(price,0);
    }
}