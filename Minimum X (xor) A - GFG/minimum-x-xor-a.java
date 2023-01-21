//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static public boolean checkBit(int n,int i){
        n=n>>i;
        return n%2==1;
    }
    public static int minVal(int a, int b) {
        // code here
        int count=Integer.bitCount(b);
        int i;
        int x=0;
        for(i=31;i>=0;i--)
        {
            if(checkBit(a,i))
            {
                x|=(1<<i);
                count--;
            }
            if(count==0)
            break;
        }
        i=0;
        while(count>0)
        {
            count--;
            while(checkBit(x,i))
            i++;
            x|=(1<<i);
            i++;
        }
        return x;
    }
}