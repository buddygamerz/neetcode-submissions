class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l=0,r=1;
        int ans=1;
        if(arr.length==1){
            return 1;
        }
        int[] vis=new int[arr.length-1];
       
        for(r=1;r<arr.length;r++){
        
        if(arr[r-1]>arr[r]){
            vis[l]=-1;
            l++;
        }
        else if(arr[r-1]<arr[r]){
            
            vis[l]=1;
            l++;
        }
        else{
            vis[l]=0;
            l++;
           
        }  
        }
        
        l=0;
        if(vis.length==1&&vis[0]!=0){
            return 2;
        }
        
        if(vis[0]==0){
            l=1;
        }

       for(r = 1; r < vis.length; r++){

            if(vis[r] == 0){
                l = r + 1;
             }
            else if(vis[r] == vis[r-1]){
                l = r;
        }

            ans = Math.max(ans, r-l+2);
        }
        return ans;

    }
}