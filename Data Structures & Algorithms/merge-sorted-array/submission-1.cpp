class Solution {
public:
  
    void combine(vector<int>& nums1,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        vector<int> temp;
        while(left<=mid && right<=high){
            if(nums1[left]<=nums1[right]){
                temp.push_back(nums1[left]);
                left++;
            }
            else{
                temp.push_back(nums1[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.push_back(nums1[left]);
                left++;
        }
        while(right<=high){
            temp.push_back(nums1[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums1[i]=temp[i-low];
    }

    }
    void ms(vector<int>& nums1,int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        ms(nums1,low,mid);
        ms(nums1,mid+1,high);
        combine(nums1,low,mid,high);

    }
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int j=nums1.size()-1;
       // nums1.resize(m+n);
        for(int i=nums2.size()-1;i>=0;i--){
            nums1[j]=nums2[i];
            j--;
        }
        ms(nums1,0,m+n-1);
    }
} ;