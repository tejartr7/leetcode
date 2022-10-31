import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
     int m=matrix.length,n=matrix[0].length;
     int temp=-n+1;
     int i,j;
     Set<Integer> set=new HashSet<>();
     while(temp<m)
     {  
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i-j==temp)
                {
                    if(set.size()==0)
                    set.add(matrix[i][j]);
                    else if(!set.contains(matrix[i][j]))
                    return false;
                }
            }
        }
        set.clear();
        temp++;
     }
     return true;
    }
}