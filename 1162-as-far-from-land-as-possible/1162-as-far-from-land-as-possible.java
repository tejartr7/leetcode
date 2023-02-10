class Solution {
    public class Pair{
        int x;
        int y;
        
        Pair(int x ,int y ){
            this.x=x;
            this.y=y;
        }
    }
    public int maxDistance(int[][] grid) {
        ArrayDeque <Pair> q=new ArrayDeque<>();
        
        for(int i=0;i<grid.length;i++ ){
            for(int j =0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                    
                }
                else{
                    
                }
            }
        }
        
        if(q.size()==0 || q.size()==grid.length*grid[0].length){
            return -1;
        }
        int [][] dirs={{-1,0},{0,1},{1,0},{0,-1}};
        
        int level=-1;
        while(q.size()!=0){
            int size=q.size();
            level++;
        while(size-->0){
            Pair rem=q.removeFirst();
            
            for(int i =0;i<dirs.length;i++){
            int newrow=rem.x+dirs[i][0];
            int newcol=rem.y+dirs[i][1];
                
            if(newrow>=0 && newcol>=0 && newrow<grid.length && newcol<grid[0].length && grid[newrow][newcol]==0){
                grid[newrow][newcol]=1;//marking it as visited
                q.add(new Pair(newrow,newcol));
            }
         }
        }
  }
   return level;
    }
}