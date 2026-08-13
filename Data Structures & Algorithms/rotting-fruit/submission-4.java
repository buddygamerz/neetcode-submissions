class Solution {
    public int orangesRotting(int[][] grid) {
        int rsize=grid.length;
        int csize=grid[0].length;
        int[] drow={1,-1,0,0};
        int[] dcol={0,0,1,-1};
        int time=0;
         Queue<int[]> q=new LinkedList<>();
      

        for(int i=0;i<rsize;i++){
            for(int j=0;j<csize;j++){
                if(grid[i][j]==2){
               
                q.add(new int[]{i,j});
                }}}
                while(!q.isEmpty()){
                       int size = q.size();
                       boolean rotted=false;
                    for (int k = 0; k < size; k++) {//to add all cells in that specific bfs layer we are calculating time layer wise not rotten fruit wise
                    int[] currnode=q.poll();
                    int row=currnode[0];
                    int col=currnode[1];
                
                    for(int d=0;d<4;d++){
                        int nrow=row+drow[d];
                        int ncol=col+dcol[d];
                        if(nrow<rsize && nrow>=0 && ncol<csize && ncol>=0){
                            if(grid[nrow][ncol]==1){
                                grid[nrow][ncol]=2;
                                q.add(new int[]{nrow,ncol});
                                rotted=true;
                            }
                            
                            }
                            
                            }
                          
                    }
                      if(rotted==true){
                                time++;
                        }
                  
                }
                
              
            
        for(int i=0;i<rsize;i++){
            for(int j=0;j<csize;j++){
                if(grid[i][j]==1){
                    return -1;}
                    }
                }
        return time;
    }
}
