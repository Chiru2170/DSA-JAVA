class Solution {
    public int minSteps(String s, String t) {
        // HashMap<Character,Integer> a = new HashMap<>();
        // HashMap<Character,Integer> b = new HashMap<>();

        // for(char ele : s.toCharArray() ){
        //     if(a.containsKey(ele)){
        //         int freq = a.get(ele);
        //         a.put(ele,freq+1);
        //     }
        //     else a.put(ele,1);
        // }
        // for(char ele : t.toCharArray() ){
        //     if(b.containsKey(ele)){
        //         int freq = b.get(ele);
        //         b.put(ele,freq+1);
        //     }
        //     else b.put(ele,1);
        // }
        // int ans = 0;
        // for(char ch : a.keySet()){
        //     if(!b.containsKey(ch)) ans += a.get(ch);
        //     else{
        //         int bfreq = b.get(ch);
        //         int afreq = a.get(ch);
        //         if(bfreq<afreq)  ans += (afreq-bfreq);
        //     }
        // }
        // return ans;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch : s.toCharArray()){
            freq1[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            freq2[ch-'a']++;
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]) ans += freq1[i]-freq2[i];
        }
        return ans;
    }
}