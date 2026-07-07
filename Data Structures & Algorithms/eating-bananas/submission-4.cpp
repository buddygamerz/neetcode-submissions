class Solution {
public:
    bool canfinish(int mid,vector<int>piles,int h){
        int th=0;
        for(int i=0;i<piles.size();i++){
            th += (piles[i] + mid - 1) / mid;
            if(th>h){
                return false;
            }
        }
        return true;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int ans=-1;
        if(piles.size()==1 && piles[0]==h){
            return h;
        }
        else if(piles.size()==1 && piles[0]>h){
            ans=0;
            while(piles[0]>h){
                ans++;
                piles[0]-=h;
            }
            ans++;
            return ans;

        }
        
        
        
        int low=1;
        int high = *max_element(piles.begin(), piles.end());
        
    
        

            while(low<=high){
                int mid=low+(high-low)/2;
                if(canfinish(mid,piles,h)==true){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
           
        
        return ans;
        
 
 }
};
