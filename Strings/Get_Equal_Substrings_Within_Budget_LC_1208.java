class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxlen = 0;
        int l = 0;
        for(int r=0;r<s.length();r++){
            maxCost -= Math.abs(s.charAt(r)-t.charAt(r));
            while(maxCost<0){
                maxCost += Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}