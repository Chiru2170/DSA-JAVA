class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans  = new StringBuilder();
        String first = strs[0];
        for(int i=0;i<first.length();i++){
            int j = 1;
            while(j<strs.length){
                if(i>=strs[j].length() || first.charAt(i)!=strs[j].charAt(i)){
                    return ans.toString();
                }
                j++;
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}