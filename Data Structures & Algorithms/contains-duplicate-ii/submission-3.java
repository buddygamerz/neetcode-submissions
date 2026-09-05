class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int r=0;
        
        HashSet<Integer>set=new HashSet<>();
        for(r=0;r<nums.length;r++){
             if(set.contains(nums[r])){
                    return true;
                }
            set.add(nums[r]);
            if(set.size()>k){
                set.remove(nums[r-k]);
                }
            }
           return false; 
        }
        
    }
