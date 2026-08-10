class Solution {
    public int numIslands(char[][] grid) {
        
        int count=0;
        int rsize=grid.length;
        int csize=grid[0].length;
        int[] drow={1,-1,0,0};
        int[] dcol={0,0,-1,1};
        boolean[][] visited=new boolean[rsize][csize];
        for(int i=0;i<rsize;i++){
            for(int j=0;j<csize;j++){
                if(grid[i][j]=='1'&& !visited[i][j]){
                    count++;
                    Queue<int[]>q=new LinkedList<>();
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[] currnode=q.poll();
                        int row=currnode[0];
                        int col=currnode[1];
                        
                        for(int d=0;d<4;d++){
                            int newrow=drow[d]+row;
                            int newcol=dcol[d]+col;
                            if(newcol>=0 && newcol<csize && newrow>=0 && newrow<rsize){
                                if(grid[newrow][newcol]=='1'&& !visited[newrow][newcol]){
                                    grid[newrow][newcol]='0';
                                    visited[newrow][newcol]=true;
                                    q.add(new int[]{newrow,newcol});
                                    
                                }
                        
                    
                }
            }
                } 
            }
        }
      
        
        }
        return count;
    }
}
