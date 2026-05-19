class Solution {
public:
    int search(vector<int>& nums, int target) {
        int low=0;
        int high=nums.size()-1;
        int mid;
         if(target==nums[0]){
             return 0;
         }
         else if(nums.size()==1&& target!=nums[0] ){
             return -1;
         }

        while(low<=high){
            mid=(low+high)/2;
            if(target>nums[mid]){
                low=mid+1;}
            else if(target<nums[mid]){
                high=mid-1;
            }
            
            else{
                return mid;
            }
          
            
        }
       
        return -1;
    }};
