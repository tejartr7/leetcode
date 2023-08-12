//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
   static int longestSubsequence(int size, int a[])
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        
        for(int i=1; i<size; i++) {
            int n = list.size();
            if(a[i] > list.get(n-1)) list.add(a[i]);
            else {
                int index = binarySearch(list, a[i], 0, n-1);
                list.set(index, a[i]);
            }
        }
        return list.size();
    }
    
    static int binarySearch(ArrayList<Integer> list, int a, int left, int right) {
        while( right > left) {
            int mid = (left + right)/2;
            
            if(list.get(mid) >= a) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return right;
    } 


} 