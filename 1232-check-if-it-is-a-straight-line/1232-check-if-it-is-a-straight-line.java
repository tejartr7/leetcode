class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int l1=coordinates.length;
       // int l2=c[0].length;
        int i;
        double old=0;
        double k=0;
        for(i=0;i<l1;i++)
        {
             
         if((coordinates[i][1]-coordinates[0][1]) * (coordinates[1][0]-coordinates[0][0]) != (coordinates[1][1]-coordinates[0][1]) * (coordinates[i][0]-coordinates[0][0]))
             return false;
        }
        return true;
        
    }
}