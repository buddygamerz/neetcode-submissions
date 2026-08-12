class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {// every cell marked with 1 is blocked and with 0 are allowed
        int rsize=grid.length;
        int csize=grid[0].length;
       List<Integer> end = new ArrayList<>();
        if(grid[0][0]==1||grid[rsize-1][csize-1]==1){//base case
            return -1;
        }
        int count=0;
        int[] drow={-1,1,0,0,-1,-1,1,1 };
        int[] dcol={0,0,1,-1,-1,1,-1,1};//these are for diagnols easy to calculate just make the matrix and observe
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,1});//in the begining dist is 1
        grid[0][0]=1;
        while(!q.isEmpty()){//overrall structure remains same
            int[] currnode=q.poll();
            int row=currnode[0];
            int col=currnode[1];
            int dist=currnode[2];
            if(row == rsize - 1 && col == csize - 1){//immediately return when reached the end cell
                        return dist;
                       }
            for(int d=0;d<8;d++){
                int nrow=row+drow[d];
                int ncol=col+dcol[d];
                if(nrow<rsize && nrow>=0 && ncol<csize && ncol>=0){
                    if(grid[nrow][ncol]==0){
                      
                        grid[nrow][ncol]=1;
                       q.add(new int[]{nrow, ncol, dist+1});//dist shld be incremented here
                       
                    }
                }
            }
        }
      
         
         return -1;
        

    }
}