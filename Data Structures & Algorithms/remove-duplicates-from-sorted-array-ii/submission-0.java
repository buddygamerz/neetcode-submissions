class Solution {
    public int removeDuplicates(int[] nums) {
        int l=2,r=2;
        int k=0;
                for(r=2;r<nums.length;r++){
                    if(nums[r]!=nums[l-2]){
                    nums[l]=nums[r];
                    l++;
                    }
                }
                return l;
            }

        }