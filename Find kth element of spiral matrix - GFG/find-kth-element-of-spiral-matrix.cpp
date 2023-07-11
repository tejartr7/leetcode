//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
#define MAX 1000

// } Driver Code Ends
class Solution
{
    public:
    /*You are required to complete this method*/
    int findK(int a[MAX][MAX],int m,int n,int k)
    {
 		// Your code goes here.
 		int rmax=m-1,rmin=0;
	    int cmax=n-1,cmin=0;
	    int i=0,j=0;
	    while(rmax>=rmin && cmax>=cmin)
	    {
	        for(int x=cmin;x<=cmax;x++)
	        {
	            k--;
	            if(k==0) return a[rmin][x];
	        }
	        rmin++;
	        for(int x=rmin;x<=rmax;x++)
	        {
	            k--;
	            if(k==0)
	            return a[x][cmax];
	        }
	        cmax--;
	        for(int x=cmax;x>=cmin;x--)
	        {
	            k--;
	            if(k==0)
	            return a[rmax][x];
	        }
	        rmax--;
	        for(int x=rmax;x>=rmin;x--)
	        {
	            k--;
	            if(k==0)
	            return a[x][cmin];
	        }
	        cmin++;
	    }
	    return -1;
    }
};





//{ Driver Code Starts.
int main()
{
    int T;
    cin>>T;
  
    while(T--)
    {
        int n,m;
        int k=0;
        //cin>>k;
        cin>>n>>m>>k;
        int a[MAX][MAX];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                cin>>a[i][j];
            }
        }
        Solution ob;
        cout<<ob.findK(a,n,m,k)<<endl;
        
       
    }
}
// } Driver Code Ends