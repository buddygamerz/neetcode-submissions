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
                while(temp-nums[l]>=target){//if we do temp>=target it will overshoot and will drop below target value and then stop
                    temp-=nums[l];
                    l++;
                }
                if(count!=0){
                count=Math.min(r-l+1,count);
                }
                else{
                    count=r-l+1;//so that it can register first subarray before we use min in if condition.
                }
                
                
            }
        }
        return count;
    }
}