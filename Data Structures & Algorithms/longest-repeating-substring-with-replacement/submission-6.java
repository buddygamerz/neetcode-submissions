class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        HashMap<Character,Integer>map=new HashMap();
        int maxfreq=0;
        int ans=0;
        for(r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(r)));
            while(r-l+1-maxfreq>k){
                char temp=s.charAt(l);
                map.put(temp,map.get(temp)-1);
                l++;
            }
            ans=Math.max(r-l+1,ans);
        }
        return ans;

    }
}
