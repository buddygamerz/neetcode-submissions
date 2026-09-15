class Solution {
    public int maxArea(int[] heights) {
        int maxa=0;
        int l=0,r=heights.length-1;
        while(l<r){
            maxa=Math.max((r-l)*Math.min(heights[l],heights[r]),maxa);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
            r--;
        }}
        return maxa;
    }
}
