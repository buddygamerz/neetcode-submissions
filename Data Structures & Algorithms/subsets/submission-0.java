class Solution {
    public List<List<Integer>> helper(int[]nums, List<List<Integer>> result,int i, List<Integer> subset){
        
        if(i>=nums.length){
            result.add(new ArrayList<>(subset));
            return result;
        }
        subset.add(nums[i]);
        helper(nums,result,i+1,subset);
        subset.remove(subset.size() - 1);
        helper(nums,result,i+1,subset);
        return result;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
  
        int i=0;
        return(helper(nums,result,i,subset));
        }
    }

