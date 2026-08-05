class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>maps=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
           if(maps.containsKey(nums[i])){
           return true;
        }
        maps.put(nums[i],1);
        
        }
        return false;
    }
}