class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1;
        int count=0;
        for(r=1;r<nums.length;r++){
            if(nums[l]!=nums[r]){
                l++;
                nums[l]=nums[r];
                
            }            
        }
        return l+1;
    }
}