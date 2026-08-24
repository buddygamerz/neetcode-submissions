class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int m=og.length;
        int n=og[0].length;
        if(og[0][0]==1||og[m-1][n-1]==1){
            return 0;
        }
    
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            if(og[i][0]==1){
                break;
            }
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            if(og[0][j]==1){
               break;//no need to go further if 1 exists; dry run to think clearly
            }
             dp[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(og[i][j]!=1){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
                
           }
        }
        return dp[m-1][n-1];
    }
}