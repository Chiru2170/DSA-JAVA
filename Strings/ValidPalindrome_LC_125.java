class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.toLowerCase();
        s = s.replace(" ","");

        for(int a=0;a<s.length();a++){
            if(Character.isLetterOrDigit(s.charAt(a))) ans.append(s.charAt(a));
        }

        int i=0;
        int j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}