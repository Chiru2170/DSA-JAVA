class Solution {
    public int missingMultiple(int[] nums, int k) {

        // HashSet -->

        // HashSet<Integer> set = new HashSet<>();
        // for(int ele : nums){
        //     set.add(ele);
        // }
        // for(int i=k; ;i+=k){
        //     if(!set.contains(i)) return i;
        // }

        // Frequency Array -->

        int[] freq = new int[201];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int i = k; i < freq.length; i += k) {
            if (freq[i] == 0)
                return i;
        }
        return -1;
    }
}