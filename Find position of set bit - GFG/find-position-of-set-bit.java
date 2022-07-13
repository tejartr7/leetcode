// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        // code here
        String s=Integer.toBinaryString(N);
        int i=0;
        int j;
        int l=s.length();
        int count=0;
        for(j=0;j<l;j++)
        {
            if(s.charAt(j)=='1')
            {
                count++;
                i=l-j;
            }
        }
        if(count==1)
        return i;
        
        
        return -1;
    }
};