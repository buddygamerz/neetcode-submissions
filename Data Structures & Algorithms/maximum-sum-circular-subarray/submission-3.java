class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int totalsum=0;
      int currmaxsum=0;
      int currminsum=0;
      int maxsum=nums[0];
      int minsum=nums[0];
      for(int i=0;i<nums.length;i++){
        totalsum+=nums[i];
        
        currmaxsum=Math.max(currmaxsum,0);
        currminsum=Math.min(currminsum+nums[i],nums[i]);
        currmaxsum+=nums[i];
        minsum=Math.min(minsum,currminsum);
        maxsum=Math.max(currmaxsum,maxsum); 
       }  
      if(maxsum<0){
        return maxsum;
      }
    
      return Math.max(maxsum,totalsum-minsum);
    }
}