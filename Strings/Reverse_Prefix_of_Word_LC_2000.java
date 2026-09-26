class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int idx = 0;;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                idx = i;
                break;
            }
        }
        int i = 0;
        int j = idx;
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}