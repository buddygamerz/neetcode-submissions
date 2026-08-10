class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }



        Queue<int[]>q=new LinkedList<>();
    
        
        int ogcolor=image[sr][sc];
        image[sr][sc]=color;
        int[] drow={1,-1,0,0};
        int[] dcol={0,0,1,-1};
        int row=sr;
        int col=sc;
        int rsize=image.length;
        int csize=image[0].length;
        q.add(new int[]{sr,sc});//multi array queue is intializew like this
        while(!q.isEmpty()){
            int[] currnode=q.poll();//remember to use int[] here during intializing
            int currow=currnode[0];
            int curcol=currnode[1];
            for(int i=0;i<4;i++){
                int newrow=currow+drow[i];
                int newcol=curcol+dcol[i];
                
                if(newcol<csize && newcol>=0 && newrow>=0 && newrow<rsize ){
                    if(image[newrow][newcol] == ogcolor){
                    q.add(new int[]{newrow,newcol});
                    image[newrow][newcol]=color;
                  
                }}
                }
              }
                  return image;
            } 
        }
      
