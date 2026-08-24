class Solution {
    public int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public int rob(int[] nums) {
             if(nums.length==2){
                return max(nums[0],nums[1]);
             }
             else if(nums.length==1){
                return nums[0];
             }
             else if(nums.length==0){
                return 0;
             }
             int[] dp=new int[nums.length];
             dp[0]=nums[0];
             dp[1]=max(nums[1],nums[0]);
             for(int i=2;i<nums.length;i++){
                dp[i]=max(dp[i-1],dp[i-2]+nums[i]);
             }
            return dp[nums.length-1];
    }
}
