class Solution {
    public int maxFreqSum(String s) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        // }
        // int vow = 0;
        // int con = 0;
        // for(char ele : map.keySet()){
        //     int freq = map.get(ele);
        //     if(ele=='a'||ele=='e'||ele=='i'||ele=='o'||ele=='u'){
        //         vow = Math.max(vow,freq);
        //     }
        //     else{
        //         con = Math.max(con,freq);
        //     }
        // }
        // return vow+con;

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        int vow = 0;
        int con = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vow = Math.max(vow,freq[s.charAt(i)-'a']);
            }
            else{
                con = Math.max(con,freq[s.charAt(i)-'a']);
            }
        }
        return vow+con;
    }
}