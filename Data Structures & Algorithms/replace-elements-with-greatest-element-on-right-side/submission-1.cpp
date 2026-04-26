class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
       vector<int> x(arr.size());
       x[arr.size()-1]=-1;
       int maxr=-1;
       for(int i=arr.size()-1;i>=0;i--){
        x[i]=maxr;
        maxr=max(arr[i],maxr);
       }
       return x;
    }
};