class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        int rsize=grid.length;
        int csize=grid[0].length;
        boolean[][] visited=new boolean[rsize][csize];
        int[] drow={1,-1,0,0};
        int[] dcol={0,0,-1,1};
        for(int i=0;i<rsize;i++){
            for(int j=0;j<csize;j++){
                
                if(grid[i][j]==1&&!visited[i][j]){
                        Queue<int[]> q=new LinkedList<>();
                        int row=i;
                        int col=j;
                        
                        q.add(new int[]{i,j});
                        int temparea=1;
                            while(!q.isEmpty()){
                                int[] currnode=q.poll();
                                int crow=currnode[0];
                                int ccol=currnode[1];
                                
                                for(int d=0;d<4;d++){
                                    int newrow=crow+drow[d];
                                    int newcol=ccol+dcol[d];
                                    if(newrow<rsize && newrow>=0 && newcol>=0 && newcol<csize && grid[newrow][newcol]==1 ){
                                        if(!visited[newrow][newcol]){
                                            temparea++;
                                            grid[newrow][newcol]=0;
                                            visited[i][j]=true;
                                            q.add(new int[]{newrow,newcol});
                                    }

                                }
                               
                            }
                                 
                     }
                                 if(maxarea<temparea){
                                    maxarea=temparea;
                                  }
                }
            }
        }
        return maxarea;
    }
}
