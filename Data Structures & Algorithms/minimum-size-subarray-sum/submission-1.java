class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int temp=0;
        int count=0;
        
        int[] prefix = new int[nums.length];
        // prefix[0]=nums[0];
        // for(int i=1;i<=nums.length;i++){
        //    prefix[i] = prefix[i-1] + nums[i];
        // }
        for(r=0;r<nums.length;r++){
            temp+=nums[r];
            if(temp>=target){
                while(temp-nums[l]>=target){
                    temp-=nums[l];
                    l++;
                }
                if(count!=0){
                count=Math.min(r-l+1,count);
                }
                else{
                    count=r-l+1;
                }
                
                
            }
        }
        return count;
    }
}