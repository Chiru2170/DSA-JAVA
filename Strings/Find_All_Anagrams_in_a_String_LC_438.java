class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] p_arr = new int[26];
        int[] s_arr = new int[26];
        for(int i=0;i<p.length();i++){
            p_arr[p.charAt(i)-'a']++;
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            s_arr[s.charAt(r)-'a']++;

            if(r-l+1==p.length()){
                if(Arrays.equals(p_arr,s_arr)) ans.add(l);
                s_arr[s.charAt(l)-'a']--;
                l++;
            }
        }
        return ans;
    }
}