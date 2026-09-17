class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int l = 0;
        int maxlen = 0;
        for(int r=0;r<s.length();r++){
            if((freq[s.charAt(r)])!=0){
                if(freq[s.charAt(r)] >= l){
                    l = freq[s.charAt(r)];
                }
            }
            maxlen = Math.max(maxlen,r-l+1);
            freq[s.charAt(r)] = r+1;
        }
        return maxlen;
    }
}