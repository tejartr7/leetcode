//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    
		    //appending result to a String
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    //printing the String
		    System.out.println(str);
		}
		
	}
}

// } Driver Code Ends


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        Stack<Integer> stack=new Stack<>();
        int i;
        int ans[]=new int[n];
        ArrayList<Integer> a=new ArrayList<>();
        for(i=n-1;i>=0;i--)
        {
            if(stack.isEmpty())
             {
             ans[i]=-1;
             stack.push(arr[i]);
             a.add(arr[i]);
            }
            else if(!stack.isEmpty())
            {   
               if(arr[i]<stack.peek())
               {
                   ans[i]=stack.peek();
               }
                else
                {
                    ans[i]=stack.peek();
                    stack.push(arr[i]);
                    a.add(arr[i]);
                }
                   
            }
        }
       int start=0,end=a.size()-1;
       while(start<end)
       {
           int a1=a.get(start);
           int a2=a.get(end);
           a.set(end,a1);
           a.set(start,a2);
           start++;
           end--;
       }
       return a;
    }
}
