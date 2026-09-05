class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count=0;
       int sum=0;
       int avg=0;
       int l=0,r=0;
       for(r=0;r<arr.length;r++){
        sum+=arr[r];
        if(r>=k){
            sum-=arr[l];
            l++;}
        if(r>=k-1){
            avg=sum/k;
            if(avg>=threshold){
            count++;
          }
        }
        
        
        
        
        
        
       } 
       return count;
    }
}