class Solution {
    public int characterReplacement(String s, int k) {
      int r=0,l=0;
      int maxFreq=0;
  
     
      int ans=0;
    

      HashMap<Character,Integer>map=new HashMap<>();

        for (r= 0; r < s.length(); r++) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            
            while(r-l+1-maxFreq>k){//to remove all invalid conditions
                char lChar=s.charAt(l);
                map.put(lChar, map.get(lChar) - 1);
                l++;
            }
            
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
