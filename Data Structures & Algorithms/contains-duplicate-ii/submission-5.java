class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int r=0;
        
        HashSet<Integer>set=new HashSet<>();
        for(r=0;r<nums.length;r++){
             if(set.contains(nums[r])){
                    return true;
                }
            set.add(nums[r]);
            if(set.size()>k){// here set.size will give number of elements unlike r who will give the index
            // we coulkd have done r>=k tht would also be fine
                set.remove(nums[r-k]);
                }
            }
           return false; 
        }
        
    }
