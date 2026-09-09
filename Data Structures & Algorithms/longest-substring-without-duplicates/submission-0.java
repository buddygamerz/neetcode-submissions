class Solution {
    public int lengthOfLongestSubstring(String s) {
         int r=0,l=0;
         int count=0;
         HashSet<Character>t=new HashSet<>();
         for(r=0;r<s.length();r++){
            while(t.contains(s.charAt(r))){
                t.remove(s.charAt(l));
                l++;
                
            }
            t.add(s.charAt(r));
            count=Math.max(count,r-l+1);
         }
         return count;
    }
}
