class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        int diff=0;
        for(i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(map.containsKey(diff)){//containsValue fn give O(N) containsKey gives O(1) so always the thing u want to find keep in keyt section. 
              break;
            }
            map.put(nums[i],i);
        }
        return new int[] { map.get(diff), i };
    }
}
