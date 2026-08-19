class Solution {
    public boolean iscycle(int curr,boolean[]visited,boolean[] recpath,int[][]pre){
        visited[curr]=true;
        recpath[curr]=true;
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            if(u==curr){
                if(!visited[v]){
                if(iscycle(v,visited,recpath,pre)){
                    return true;
                
            }}
            else if(recpath[v]){
                return true;
            }
            }
        }
        recpath[curr]=false;

        return false;
    }
   
   
   
    public boolean canFinish(int n, int[][] pre) {
      boolean[] vis=new boolean[n];
      boolean[] recpath=new boolean[n];
      for(int x=0;x<n;x++){
        if(!vis[x]){
            if(iscycle(x,vis,recpath,pre)){
                return false;
            }
        }
      }
        return true;
    
    
    }} 