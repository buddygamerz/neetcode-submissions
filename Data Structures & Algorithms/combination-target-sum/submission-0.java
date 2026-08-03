class Solution {
    public void helper(int[] nums,int target,int curr,int index, List<List<Integer>> result, List<Integer> subset){
        if(curr==target){
            result.add(new ArrayList<Integer>(subset));
            return;
        }
         if(curr>=target){
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            
            subset.add(nums[i]);
            helper(nums,target,curr+nums[i],i,result,subset);
            subset.remove(subset.size()-1);
        }
        

    }
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>>result=new ArrayList<>();
         List<Integer>subset=new ArrayList<>();
         int curr=0;
         helper(nums,target,curr,0,result,subset);
         return result;
    }
}
