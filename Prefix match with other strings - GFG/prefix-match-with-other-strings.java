//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.next();
            }
            
            int k = Integer.parseInt(sc.next());
            
            String str = sc.next();
            
            Solution obj = new Solution();
            int ans = obj.klengthpref(arr,n,k,str);
            System.out.println(ans);
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class node {
    node links[] = new node[26];
    int end = 0;
    int prefix = 0;

    boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    void put(char ch, node n) {
        links[ch - 'a'] = n;
    }

    node get(char ch) {
        return links[ch - 'a'];
    }

    int getEnd() {
        return end;
    }

    void increaseEnd() {
        end++;
    }

    void decreaseEnd() {
        end--;
    }

    int getPrefix() {
        return prefix;
    }

    void increasePrefix() {
        prefix++;
    }

    void decreasePrefix() {
        prefix--;
    }
}
class Solution
{
    node root;
    public void insert(String word) {
        // Write your code here.
        node curr = root;
        int i, n = word.length();
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                curr.put(ch, new node());
            }
            curr = curr.get(ch);
            curr.increasePrefix();
        }
        curr.increaseEnd();
    }
    public int countWordsStartingWith(String word) {
        // Write your code here.
        node curr = root;
        int i, n = word.length();
        for (i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!curr.containsKey(ch)) {
                return 0;
            } else {
                curr = curr.get(ch);
            }
        }
        return curr.getPrefix();
    }
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        root=new node();
        for(String x:arr)
        insert(x);
        if(k>str.length()) return 0;
        return countWordsStartingWith(str.substring(0,k));
    }
}