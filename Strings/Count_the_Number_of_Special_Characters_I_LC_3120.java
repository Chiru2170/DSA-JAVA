class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        for(char ele : set){
            if(set.contains((char)(ele-32))) count++;
        }
        return count;
    }
}