class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int minlen = s.length();
        String sb = "";

        int i=0;
        while(i<s.length()){
            int j=i;
            int count = 0;
            int len = 0;
            while(j<s.length()){
                char ch = s.charAt(j);
                if(ch=='1'){
                    count++;
                }
                if(count==k) break;
                j++;
            }
            if(count==k){
                len = j-i + 1 ;
                if(len<minlen){
                    minlen = len;
                    sb = (s.substring(i,j+1));
                }
                else if(len==minlen && s.substring(i,j+1).compareTo(sb)<0){
                    minlen = len;
                    sb = (s.substring(i,j+1));
                }
                else if(len==s.length()){
                    sb = s;
                }
            }
            i++;
        }
        return sb;
    }
}