class Solution {
      public int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int t1=text1.length();
        int t2=text2.length();
        int[][] dp=new int[t1+1][t2+1];
        int x=0;
        for(int i=1;i<=t1;i++){
            for(int j=1;j<=t2;j++){
            if(text2.charAt(j-1)==text1.charAt(i-1)){
                dp[i][j]=dp[i-1][j-1]+1;//because we are comparing using both t1 and t2 rthats why i-1 and j-1;
            }
            else{
                dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
            }
            }
        }
        return dp[t1][t2];
    }
}
