class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;
        int[] prefixfront =new int[nums.length+1];
        int[] prefixback =new int[nums.length+1];
        int j=nums.length-1;
        for(i=0;i<nums.length;i++){
            prefixfront[i+1]=prefixfront[i]+nums[i];
        }
        for(j=nums.length-1;j>=0;j--){   
            prefixback[j]=prefixback[j+1]+nums[j];//we have intialized it for nums.length+1 so it will not go out of bounds

        }
        for(j=0;j<nums.length;j++){
            if(prefixfront[j]==prefixback[j+1]){
                return j;
            }
        }
        return -1;

    }
}