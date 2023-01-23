//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
     public int largestRectangleArea(int[] h) {
        int ans=0;
        int i,n=h.length;
        Stack<Integer> stack=new Stack<>();
        int s[]=new int[n];
        int e[]=new int[n];
        for(i=n-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                s[i]=-1;
            }
            else
            {
                while(!stack.isEmpty())
                {
                    if(h[stack.peek()]>=h[i])
                    stack.pop();
                    else
                    break;
                }
                if(stack.isEmpty())
                s[i]=-1;
                else
                s[i]=stack.peek();
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        stack.pop();
        for(i=0;i<n;i++)
        {
            if(stack.isEmpty())
            {
                e[i]=-1;
            }
            else
            {
                while(!stack.isEmpty())
                {
                    if(h[stack.peek()]>=h[i])
                    stack.pop();
                    else
                    break;
                }
                if(stack.isEmpty())
                e[i]=-1;
                else
                e[i]=stack.peek();
            }
            stack.push(i);
        }
        for(i=0;i<n;i++)
        {
            int x;
            if(s[i]==-1)
            {
                s[i]=n;
            }
            x=s[i]-e[i]-1;
            ans=Math.max(h[i]*x,ans);
           // System.out.println(s[i]+" "+e[i]);
        }
        return ans;
    }
    public int maxArea(int mat[][], int n, int m) {
        // add code here.
        int i,j;
        int ans=0;
        ans=Math.max(ans,largestRectangleArea(mat[0]));
        for(i=1;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(mat[i][j]!=0)
                mat[i][j]+=mat[i-1][j];
            }
            ans=Math.max(ans,largestRectangleArea(mat[i]));
        }
        return ans;
    }
}