class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int i,j,m=matrix.length,n=matrix[0].length;
        int l=matrix[0][0];
        int r=matrix[m-1][n-1];
        int ans=0;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(counter(matrix,mid)>=k)
            {
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    public int counter(int mat[][],int x)
    {
        int cnt=0;
        int i,j,m=mat.length,n=mat[0].length;
        j=n-1;
        for(i=0;i<n;i++)
        {
            while(j>=0 && mat[i][j]>x) j--;
            cnt+=j+1;
        }
        return cnt;
    }
}