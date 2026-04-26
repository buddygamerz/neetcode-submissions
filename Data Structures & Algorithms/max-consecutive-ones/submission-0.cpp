class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
       vector<int>count;
       int temp=0;
       for(int i=0;i<nums.size();i++){
        
        if(nums[i]==1){
            temp++;
        }
        else if(nums[i]==0){
            count.push_back(temp);
            temp=0;
        }
        count.push_back(temp);
       } 
       int result=*max_element(count.begin(),count.end());
       return result;
    }
};