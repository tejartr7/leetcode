//{ Driver Code Starts
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
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public boolean helper(String a,String pattern)
    {
        String temp="";
        for(int i=0;i<a.length();i++)
        {
            if(Character.isUpperCase(a.charAt(i)))
            {
                temp+=a.charAt(i);
            }
        }
        if(temp.length() < pattern.length())   return false;
        int i = 0;
        int j = 0;
        while(i<temp.length() && j<pattern.length())
        {
            if(temp.charAt(i)!=pattern.charAt(j))
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        ArrayList<String> arr = new ArrayList<>();
        for(String str : Dictionary)
        {
            if(helper(str,Pattern))
            {
                arr.add(str);
            }
        }
        Collections.sort(arr);
        if(arr.size() == 0)
        {
            arr.add("-1");
            return arr;
        }
        return arr;
    }
}