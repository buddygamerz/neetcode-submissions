class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int currsum=0;
      
        int maxsum=nums[0];
        int minsum=nums[0];
        int n=nums.length-1;
        int totalsum=0;
         for(int i =0;i<nums.length;i++){
            totalsum+=nums[i];
         }
        for(int r=0;r<nums.length;r++){
            currsum=Math.max(currsum,0);
            currsum+=nums[r];
            maxsum=Math.max(currsum,maxsum);
        }
        for(int r=0;r<nums.length;r++){
            currsum=Math.min(currsum+nums[r],nums[r]);
           
            minsum=Math.min(currsum,minsum);
        }
         
        if(maxsum<0){
        return maxsum;}

            return Math.max(maxsum,totalsum-minsum);
       
    }
}