class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
       ArrayList<Integer> result = new ArrayList<>();
        int i=0;
        int diff=0;
        for(i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(map.containsKey(diff)){
              break;
            }
            map.put(nums[i],i);
        }
        return new int[] { map.get(diff), i };
    }
}
